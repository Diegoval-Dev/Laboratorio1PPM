public class ItemDataJ {
    Object originalValue;

    public ItemDataJ(Object originalValue) {

        this.originalValue = originalValue;

    }

    public String getType() {

        if(this.originalValue instanceof String) {
            return "cadena";
        } else if (this.originalValue instanceof Integer) {
            return "entero";
        } else if (this.originalValue instanceof Boolean){
            return "boolean";
        } else {
            return null;
        }

    }

    public String getInfo(){

        if (this.originalValue instanceof String) {

            return "L" + ((String) this.originalValue).length();

        } else if (this.originalValue instanceof Integer) {

            if (((Integer)this.originalValue % 10) == 0) {
                return "M10";
            } else if (((Integer)this.originalValue % 5) == 0) {
                return "M5";
            } else if (((Integer)this.originalValue % 2) == 0) {
                return "M2";
            } else {
                return null;
            }

        } else if (this.originalValue instanceof Boolean){

            if ((boolean) this.originalValue) {
                return "Verdadero";
            } else{
                return "Falso";
            }

        } else {
            return null;
        }
    }

}
