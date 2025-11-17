public class var_word {
    public static void main(String[] args) {
        Object arr[]={1,2,"vip"};
        for (var element : arr) {
            System.out.println(element);
        }
        // var name="vipin";
        // System.out.println(name);

        // ...existing code...
// public class var_word {
//     public static void main(String[] args) {
// -        var arr[]={1,2,"vip"};
// +        // Option A: explicit array type
// +        Object[] arr = {1, 2, "vip"};
// +        // Option B (keeps var): var arr = new Object[]{1, 2, "vip"};
//         for (var element : arr) {
//             System.out.println(element);
//         }
//         // var name="vipin";
//         // System.out.println(name);
//     }
// }
// // ...existing code...

    }
}
