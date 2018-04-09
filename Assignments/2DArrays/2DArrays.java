class 2DArrays {
 int[][] arr1 = new int[3][3];

    for(int i = 0; i < arr1.length; i++) {
        for(int j = 0; j < arr1[i].length; j++) {
            arr1[i][j] = (i * 2) * (j * 2);
        }
    }
        // [0,2,4]
        // [6,8,10]
        // [12,14,16]


    int[][] arr2 = new int[3][3];
    for(int i = 0; i < arr2.length; i++) {
        for(int j = 0; j < arr2[i].length; j++) {
            arr2[i][j] = arr1[i][j] * arr1[i][j];
        }
    }

        // [0,2,16]
        // [36,64,100]
        // [144,196,256]


    int[][] arr3 = new int[5][5];

    int num = 1;
    for(int i = 0; i < arr3.length; i++) {
        for(int j = 0; j < arr3[i].length; j++) {
            arr3[i][j] = num; 
            num *= 2
        }
    }

    // [0,2,4,6,8]
    // [10,12,14,16,18]
    // [20,22,24,26,28]
    // [30,32,34,36,38]
    // [40,42,44,46,48]
}