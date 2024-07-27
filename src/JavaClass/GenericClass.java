package JavaClass;

public class GenericClass<T> {
    T message;
    public void setMessage(T message){
        this.message = message;
    }

    public class Pair<K,V> {
        private K key;
        private V value;
        public Pair(K key, V value){
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

    public <U, V> void isKeyEqual(Pair<U, V> par1, Pair<U, V>  par2){
        System.out.println(par1.getKey() == par2.getKey());
    };

    public <U, V> void isValueEqual(Pair<U, V> pair1, Pair<U, V> pair2){
        System.out.println(pair1.getValue() == pair2.getValue());
    };

    public static class UpperBoundedGenericClass<T extends Number>{
        private T num1;
        public UpperBoundedGenericClass(T value) {
            this.num1 = value;
        }

        public T getNum1() {
            return this.num1;
        }
    }
}
