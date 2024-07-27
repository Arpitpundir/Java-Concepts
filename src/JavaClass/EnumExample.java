package JavaClass;

public enum EnumExample {
    SUNDAY(1, "First Day"){
        public String dummyAbstractMethod(){
            return "This is Sunday";
        }
    },
    MONDAY(2, "First Work Day"){
        public String dummyAbstractMethod(){
            return "This is Monday";
        }
    },
    TUESDAY(3, "No chicken on this day"){
        public String dummyAbstractMethod(){
            return "This is Tuesday";
        }
    },
    WEDNESDAY(4, "Half of the battle is done"){
        public String dummyAbstractMethod(){
            return "This is Wednesday";
        }
    },
    THRUSDAY(5, "Phew"){
        public String dummyAbstractMethod(){
            return "This is Thrusday";
        }
    },
    FRIDAY(6,"So whats the plan"){
        public String dummyAbstractMethod(){
            return "This is Friday";
        }
    },
    SATURDAY(7, "Laundry Day"){
        public String dummyAbstractMethod(){
            return "This is Saturday";
        }
    };

    private int key;
    private String value;

    EnumExample(int key, String val){
        this.key = key;
        this.value = val;
    }

    public int getKey(){
        return this.key;
    }

    public String getValue(){
        return this.value;
    }

    public static EnumExample getEnumFromValue(int key){
        for(EnumExample curr: EnumExample.values()) {
            if (curr.getKey() == key) {
                return curr;
            }
        }
        return null;
    }

    public abstract String dummyAbstractMethod();
}
