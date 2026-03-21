 public int[] arrayInsert(int[] a, int insertIndext, int number) {
       /* 先来解决第一种情况，我们如果插入这个数组它有空位，0代表空位，我们就只需要找到后面的元素的
        第一个空位依次往后移动把需要插入的元素给它留出位置，然后根据索引下标插入元素即可*/
        int firstEmptyIndex = -1;//初始值定为-1，表示我们没有找到空元素
        /*这个循环的目的是为了找到这个数组中是否还有空位置*/
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                firstEmptyIndex = i;//找到后面第一个元素为空的位置，并且记录一下它的索引下标。
                break;//找到第一个空位置我们就要跳出循环了。
            }
        }
        /*如果说遍历结束之后，我们还是找不到也就是说我们的这个firstEmptyIndex还是=-1，我们就要扩容了*/
        if (firstEmptyIndex == -1) {
            firstEmptyIndex = a.length; //此刻我们需要记录一下在扩容之后第一个空元素的下标，扩容之后第一个空元素的下标就是原来数组a的长度那个位置
            int[] b = new int[a.length * 2];
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            a = b;
        }
        /*这部分代码用来实现将我要插入的索引的位置开始把它的元素依次往后移动，记住这里有一个小细节，
        我们移动元素只能从后面往前面一个一个的移动不然会出现元素覆盖的情况*/
        for (int j = firstEmptyIndex - 1; j >= insertIndext; j--) {
            a[j + 1] = a[j];
        }
        a[insertIndext] = number;
        return a;
    }
