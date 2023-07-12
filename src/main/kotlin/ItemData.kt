class ItemData(val originalValue: Any) {

    fun getType(): String {
        return when(originalValue){
            is String -> "cadena"
            is Int -> "entero"
            is Boolean -> "booleano"
            else -> null!!
        }
    }

    fun getInfo(): String {

        if (originalValue is String) {
            return "L${originalValue.length}"
        } else if (originalValue is Int) {
            if (originalValue % 10 == 0) {
                return "M10"
            } else if (originalValue % 5 == 0) {
                return "M5"
            } else if (originalValue % 2 == 0) {
                return "M2"
            } else {
                return null!!
            }
        } else if (originalValue is Boolean) {
            return when(originalValue) {
                true -> "Verdadero"
                else -> {"Falso"}
            }
        } else {
            return null!!
        }
    }
}