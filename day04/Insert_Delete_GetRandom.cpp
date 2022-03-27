class RandomizedSet {
public:
    unordered_map<int,int> mp;
    vector<int> vec;
    RandomizedSet() {
        
    }
    
    bool insert(int val) {
        if(mp.find(val)!=mp.end()){
            return false;
        }
        else{
            vec.push_back(val);
            mp[val]=vec.size()-1;
            return true;
        }
    }
    
    bool remove(int val) {
        if(mp.find(val)==mp.end()){
            return false;
        }
        else{
            int last=vec.back();
            vec[mp[val]]=last;
            vec.pop_back();
            mp[last]=mp[val];
            mp.erase(val);
            return true;
        }
    }
    
    int getRandom() {
        return vec[rand()%vec.size()];
    }
};

