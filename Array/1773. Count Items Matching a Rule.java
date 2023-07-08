class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> list : items){
            String type = list.get(0);
            String color = list.get(1);
            String name = list.get(2);

            if( ruleKey.equals("type")  && ruleValue.equals(type) ||
                ruleKey.equals("color") && ruleValue.equals(color) ||
                ruleKey.equals("name") &&  ruleValue.equals(name) ){
                    count++;
                }
        }

        return count;


    }
}