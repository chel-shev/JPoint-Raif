class StringConversion {

    private final String oldString;

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
        final StringBuilder newString = new StringBuilder();
        int finishSequence = 0, startSequence = 0;
        for (; finishSequence < oldString.length(); finishSequence++) {
            if (oldString.charAt(startSequence) != oldString.charAt(finishSequence)) {
                newString.append(getNewPart(startSequence, finishSequence));
                startSequence = finishSequence;
            }
        }
        newString.append(getNewPart(startSequence, finishSequence));
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
     * @return result string
     */
    private String getNewPart(int start, int finish) {
        return (finish - start == 1 ? "" : finish - start) +
                oldString.substring(start, start + 1);
    }
}
