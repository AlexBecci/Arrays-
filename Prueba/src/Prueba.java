
public class Prueba {

    public static void main(String[] args) {

        int[] nums = {1, 1,2}; // Input array

        int[] expectedNums = {1, 2}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation
        System.out.println("k = " + k);
        if (k == expectedNums.length) {
            System.out.println("largo de la lista es el esperado");
        }
        for (int i = 0; i < k; i++) {
            if (nums[i] == expectedNums[i]) {
                continue;
            } else {
                System.out.println("Error\n");
                break;
            }
        }
    }
    public static int removeDuplicates(int[] nums) {
        int contador = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                int numAntes = --i;
                //System.out.println("numAnte = " + numAnte);
                i++;
                System.out.println("nums = " + nums[i]);
                if (numAntes == nums[i]) {
                    System.out.println("NUMERO REPETIDO: " + nums[i]);
                } else {
                    contador++;
                }

            }
        }
        System.out.println("Contador numeros= " + contador);
        return nums.length;
    }

}
