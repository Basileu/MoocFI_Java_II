package dictionary;

public class Main {

    public static void main(String[] args) {
        // You can test your dictionary here
//        SaveableDictionary dictionary = new SaveableDictionary();
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        dictionary.add("apina", "apfe");
////        dictionary.add("apfe", "apina");
//
//        System.out.println(dictionary.translate("apina"));
//        System.out.println(dictionary.translate("monkey"));
//        System.out.println(dictionary.translate("ohjelmointi"));
//        System.out.println(dictionary.translate("banana"));
//        System.out.println(dictionary.translate("apfe"));

//        SaveableDictionary s = new SaveableDictionary("words.txt");
//        System.out.println(s.load());
        SaveableDictionary s = new SaveableDictionary("test-98072.txt");
        s.add("tietokone", "computer");
        s.save();
    }
}
