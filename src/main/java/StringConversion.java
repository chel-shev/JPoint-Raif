class StringConversion {

    private final String oldString;
    private StringBuilder newString;

    StringConversion(String string) {
        this.oldString = string;
    }

    /**
     * Getting the converted string
     *
     * @return result string
     */
    public String getConvertedString() {
        if (oldString == null || oldString.equals(""))
            return oldString;
        newString = new StringBuilder();
        int finishSequence = 0, startSequence = 0;
        char charSequence = oldString.charAt(startSequence);
        for (; finishSequence < oldString.length(); finishSequence++) {
            if (charSequence != oldString.charAt(finishSequence)) {
                addNewPart(startSequence, finishSequence, charSequence);
                charSequence = oldString.charAt(startSequence = finishSequence);
            }
        }
        addNewPart(startSequence, finishSequence, charSequence);
        return newString.toString();
    }

    /**
     * Convert part of a string
     * AAA -> 3A
     * BB -> 2B
     * C -> C
     *
     * @param start  - sequence start index
     * @param finish - sequence finish index
     */
    private void addNewPart(int start, int finish, char mainChar) {
        newString.append(finish - start == 1 ? "" : finish - start);
        newString.append(mainChar);
    }
}
