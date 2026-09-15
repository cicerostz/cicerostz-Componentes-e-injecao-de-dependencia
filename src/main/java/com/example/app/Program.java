package com.example.app;
import com.example.entities.Order;
import com.example.services.OrderService;
import com.example.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class Program implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Program.class, args);
	}


    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu código: ");
        Integer codigo = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o valor: ");
        double basic = Double.parseDouble(sc.nextLine());

        System.out.println("Digite a porcentagem do desconto: ");
        double discount = Double.parseDouble(sc.nextLine());


        Order o = new Order(codigo, basic, discount);



        ShippingService shippingService = new ShippingService();
        double valorEntrega = shippingService.shippiment(o);

        OrderService orderService = new OrderService();
        double valorTotal = orderService.total(o);

        System.out.println("Código: " + o.getCode());
        System.out.printf("Valor total: %.2f%n", valorTotal);
        System.out.printf("Valor do frete: %.2f%n", valorEntrega);





    }
}


