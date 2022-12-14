public class Main {
    public static void main(String[] args) {
        int[] list = {5, 8,8,8, 2, 2, 0, 5, 7, 11, 22, 27, 22, 25, 25, 24, 24};
        for(int i=0; i< list.length;i++){
            for (int j=0; j<list.length;j++){
                if (list[i]%2==0 && list[j]%2==0){
                    if (( i != j) && (list[i] == list[j])){
                        System.out.println("Aynı olan elemanlar==> "+ list[i]);
                    }
                }
            }
        }
    }
}