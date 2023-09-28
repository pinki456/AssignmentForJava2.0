class EleAppeared{
    public static void main(String []args){
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,5,7,9};
        int arr3[]={1,3,4,5,8};

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    for(int k=0; k<arr3.length; k++){
                        if(arr1[i] == arr3[k]){
                            System.out.print(arr1[i] + " ");
                        }
                    }
                }
            }
        }

    }
}
