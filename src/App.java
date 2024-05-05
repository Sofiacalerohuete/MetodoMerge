private static void merge(int[] arr, int left, int mid, int right){
    //tamaños
    int sizeLeft = mid - left+1;
    int sizeRight= right - mid;

    //arreglos temporales
    int [] tempLeft = new int [sizeLeft];
    int [] tempRight = new int [sizeRight];
    
    //se copia los datos a los arreglos temporales
    for (int i = 0 ; i < sizeLeft; i++){
        tempLeft [i] = arr [left + i];
    }
    for (int j = 0; j< sizeRight; j++){
        tempRight [j] = arr [mid + 1 + j];
    }
    while (i < sizeLeft && j< sizeRight){
        if (tempLeft[i] <= tempRight[j]){
            arr[k] = tempLeft[i];
            i++;
        }else{
            arr [k] = tempRight[j];
            j++;
        }
        k++;
    }
    while (i < sizeLeft){
        arr[k] = tempLeft[i];
        i++;
        k++;
    }
    while(j < sizeRight){
        arr [k] = tempRight[j];
        j++;
        k++;
    }

}
