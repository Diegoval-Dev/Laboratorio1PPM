class ItemData(val originalValue: Any) {

    fun getType(): String {
        return when(originalValue){
            is String -> "cadena"
            is Int -> "entero"
            is Boolean -> "boolean"
            else -> null!!
        }
    }

    fun getInfo(): String {

        if (originalValue is String) {
            return "L${originalValue.length}"
        } else if (originalValue is Int) {
            return when(originalValue){
                % 10 == 0 ->
            }
        }
    }
}