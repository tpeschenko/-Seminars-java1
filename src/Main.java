//1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
//3)Создать класс Basket, содержащий массив купленных товаров.
//4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
//5)Вывести на консоль каталог продуктов. (все продукты магазина)
//6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product milk = new Product("Молоко", 50, 10);
        Product bread = new Product("Хлеб", 22, 7);
        Product sausages = new Product("Сосиски", 170, 8);
        Category food = new Category("Еда", new Product[]{milk, bread, sausages});

        Product shirt = new Product("Рубашка", 1700, 9);
        Product skirt = new Product("Юбка", 900, 5);
        Product pants = new Product("Брюки", 2200, 6);
        Category clothes = new Category("Одежда", new Product[]{shirt, skirt, pants});

        Basket clientBuy = new Basket(new Product[]{null});



        System.out.print("Привет это магазин для покупок!\nВыбери варианты действий:\n" +
                 "Чтобы чтобы воспользоваться услугами магазина введите свой логин.\n" +
                "Ввести сюда: ");
        Scanner scan = new Scanner(System.in);
        String login = scan.nextLine();
        System.out.print("Теперь введите пароль: ");

        String password = scan.nextLine();

        User UserData = new User(login, password, clientBuy);
        while (true)
        {
            System.out.print("\nМеню выбора:\n" +
                    "1)Посмотреть все товары в магазине(введите 1)\n" +
                    "2)Посмотреть корзину(введите 2)\n" +
                    "3)перейти к покупкам(введите 3)\n" +
                    "Ввести сюда: ");
            Integer choiceOption1 = scan.nextInt();
            if(choiceOption1 == 1)
            {
                System.out.println(food);
                System.out.println(clothes);
            }
            else if(choiceOption1 == 2)
            {
                System.out.println(clientBuy);
            }
            else if(choiceOption1 == 3)
            {
                System.out.print("Выберите категорию:\n" +
                        "1) Еда(введите 1)\n" +
                        "2) Одежда(введите 2)\n" +
                        "Ввести сюда: ");
                Integer choiceOption2 = scan.nextInt();
                if(choiceOption2 == 1)
                {
                    System.out.println("Введите номер продукта:");
                    System.out.println(milk.getName()+"-1\n" + bread.getName()
                            +"-2\n"+ sausages.getName()+"-3\n");
                    System.out.print("Введите сюда: ");
                    Integer choiceOption3 = scan.nextInt();

                    if(choiceOption3 == 1)
                    {
                       clientBuy.setPurchasedProducts(new Product[]{milk});
                        System.out.println(milk.getName() + " добавлено в вашу корзину");
                        food.setProducts(new Product[]{bread, sausages});
                    }
                    else if(choiceOption3 == 2)
                    {
                        clientBuy.setPurchasedProducts(new Product[]{bread});
                        System.out.println(bread.getName() + " добавлен в вашу корзину");
                        food.setProducts(new Product[]{milk, sausages});
                    }
                    else if(choiceOption3 == 3)
                    {
                        clientBuy.setPurchasedProducts(new Product[]{sausages});
                        System.out.println(sausages.getName() + " добавлены в вашу корзину");
                        food.setProducts(new Product[]{milk, bread});
                    }


                }
                else if(choiceOption2 == 2){
                    System.out.println(clothes);
                }
                else
                {
                    System.out.println("\nНеверный ввод, введите заново");
                }

            }
            else
            {
                System.out.println("\nНеверный ввод, попробуйте заново!");
            }
        }



    }
}