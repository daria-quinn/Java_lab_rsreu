package rsreu;

public class DynamicArray <T>  {
    private T element;
    private int count = 1;//размерность массива
    private int match = 0;
    private Object[] array;

    public int GetCount(){return count;}

    DynamicArray(T element){
        this.element = element;
        array = new Object[count];
        array[0] = element;
    }

    T get(int i) {
        @SuppressWarnings("unchecked")
        final T t = (T) array[i];
        return t;
    }
    public void Add(T element){
        count++;
        array=Insert(count, element);
        /*for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }*/
    }
    public int FindMatch(){
        if(count==1){
            match=0;
        }
        else{
            for(int i=0;i<count-1;i++){
                if(array[i]==array[i+1]){
                    match++;
                }
            }
        }
        return match;
    }
    private Object[] Insert(int count, T element){
        Object[] newArray = new Object[count];
        for(int i=0;i<count-1;i++){
            //System.out.println(array[i]);
            newArray[i]=array[i];
        }
        newArray[count-1]=element;
        return newArray;
    }
}




