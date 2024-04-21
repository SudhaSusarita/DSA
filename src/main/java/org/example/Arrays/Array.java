package org.example.Arrays;

public class Array {

	private int[] items;
	private int itemCount;

	public Array(int length) {
		items = new int[length];
	}
	public void print(){
		for(int i=0;i< itemCount;i++){
			System.out.println(items[i]);

		}
		System.out.println("Item count is "+itemCount);
	}
	public void push(int item){
		//if arrayLength < itemCount
		if(items.length == itemCount) {
			//double the array's size
			int[] newArray = new int[itemCount * 2];
			//copy all elements from old to new
			for(int i=0;i< itemCount;i++){
				newArray[i] = items[i];
			}
			//set newArray back to oldArray
			items = newArray;
		}
		// push it as last element
		items[itemCount++]=item;

	}
	public void removeAt(int index){
		//check if the index is valid
		if(index < itemCount && index >=0){
			//remove the element by putting it to 0
			items[index]=0;
			//from the index shift left
			for(int i=index;i< itemCount;i++)
				items[i]=items[i+1];
			//as we removed an existing item, decrease itemCount
			itemCount--;
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}

	}
	public int indexOf(int item){
		//search for that particular item
		for(int i=0; i<itemCount;i++){
			if(items[i]==item){
				//if found return index
				return i;
			}
		}
		return -1;
	}
	public int max(){
		int max = items[0];
		for(int i=0;i<itemCount;i++){
			if(max < items[i+1])
				max = items[i+1];
		}
		return max;
	}
	public void intersect(int[] newItems){
		int[] common = new int[items.length];
		for(int item:items){
			for(int newItem :newItems){
				if(item == newItem){
					System.out.print("common items are "+item);
				}
			}
		}
	}
	public void reverse(){
		int reverseLength =itemCount;
		if(itemCount%2==0){
			reverseLength=itemCount/2 +1;
		}
		for(int i=1;i<reverseLength;i++){
			int temp = items[i-1];
			items[i-1]=items[itemCount-i];
			if(temp==items[itemCount-i]){
				break;
			}
			items[itemCount-i]=temp;

		}
	}
	public void insertAt(int item,int index){
		//check index is valid
		if(index>=0 && index <itemCount) {
			int[] newArray = new int[itemCount+1];
			//set at index
			newArray[index]=item;
			for(int i=0;i< itemCount;i++){
				//until index all the elements are same
				if(i<index)
					newArray[i]=items[i];
				else
					//set remaining of index
					newArray[index+i+1]=items[i];
			}
			items=newArray;
		}
	}
}
