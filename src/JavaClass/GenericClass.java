package JavaClass;

public class GenericClass<T> {
    T message;
    public void setMessage(T message){
        this.message = message;
    }

    public class Pair<K,V> {
        private K key;
        private V value;
        Pair(K key, V value){
            this.key = key;
            this.value = value;
        }

        K getKey(){
            return this.key;
        }

        V getValue(){
            return this.value;
        }
    }

    public T getMessage(){
        return this.message;
    }

    public <U, V> boolean isKeyEqual(Pair<U, V> par1, Pair<U, V>  par2){
        return par1.getKey() == par2.getKey();
    }

    public <U, V> boolean isValueEqual(Pair<U, V> pair1, Pair<U, V> pair2){
        return pair1.getValue() == pair2.getValue();
    }
}
