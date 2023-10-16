 class RandomizedSet {
        static int[] nums = new int[200010];
        Random random = new Random();
        Map<Integer, Integer> map = new HashMap<>();
        int idx = -1;

        public boolean insert(int val) {
            if (map.containsKey(val))
                return false;
            nums[++idx] = val;
            map.put(val, idx);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val))
                return false;
            int loc = map.remove(val);
            if (loc != idx)
                map.put(nums[idx], loc);
            nums[loc] = nums[idx--];
            return true;
        }

        public int getRandom() {
            return nums[random.nextInt(idx + 1)];
        }
    }
