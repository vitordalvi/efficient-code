import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a quantidade de dias desejado: ");
    int days = sc.nextInt();

    System.out.print("Digite a média de vendas: ");
    double averageSales = sc.nextDouble();

    double totalSales = Gauss.salesUntilDate(days, averageSales);
    System.out.printf("O estimado de vendas até o dia %d é: R$%.2f%n", days, totalSales);
    
    sc.close();
}