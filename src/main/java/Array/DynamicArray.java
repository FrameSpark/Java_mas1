package Array;

/**
 * @author FrameSpark
 */

public class DynamicArray {
    private int array[];
    private int size;

    public int getSize(){
        return this.size;
    }

    public DynamicArray(int size){
        this.size = size;
        array = new int[size];
    }

    /**
     *
     * @param index номер элемента выводимого массива
     * @return
     */
    public int showElementByIndex(int index){
        if(inRange(index)){
            return this.array[index];
        }
        return -99999;
    }
    /**
     *
     * @param value Значение, которое нужно добавить
     */
    public void insertElement(int value){
        this.size++;
        int temp[] = new int[size];
        for(int i=0; i< size-1; i++){
            temp[i] = array[i];
        }
        temp[size-1] = value;
        array = temp;
    }

    /**
     *
     * @param index Проверка индекса на вход в диапазон массива
     * @return Возвращает истину, если индекс входит в диапазон массива
     */
    private boolean inRange(int index){
        if (index < size && index >= 0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     *
     * @param value Новое значение
     * @param index Индекс значения для замены
     */
    public void changeElementByIndex(int value, int index){
        if(inRange(index)){
            array[index] = value;
        }
    }

    /**
     *
     * @param index Удаляемый инлекс
     */
    public void deleteElementByIndex(int index){
        if(inRange(index)){
            this.size--;
            int temp[]=new int[size];
            for(int i=0,j=0; i<size; i++, j++ ){
                if(j == index)
                {
                    j++;
                }
                temp[i] = array[j];
            }
            array = temp;
            }
        }



    public void showArray(){
        for(int i=0; i<size;i++){
            System.out.print(array[i] + " ");
        }
    }


}
