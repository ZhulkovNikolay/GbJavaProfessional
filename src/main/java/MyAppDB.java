public class MyAppDB {
    //3. Написать консольное приложение, которое позволяет узнать цену товара по его имени, либо
    //вывести сообщение «Такого товара нет», если товар не обнаружен в базе. Консольная
    //команда: «/цена товар545».

    //4. Добавить возможность изменения цены товара. Указываем имя товара и новую цену.
    //Консольная команда: «/сменитьцену товар10 10000».
    //5. Вывести товары в заданном ценовом диапазоне. Консольная команда: «/товарыпоцене 100
    //600».

    public static void main(String[] args) {
        SqliteFiller sqliteFiller = new SqliteFiller();
        sqliteFiller.sql();

        SearchCost searchCost = new SearchCost();
        if (args[0].equals("/цена")) {
            searchCost.sql(args[1]);
        }

        ChangePrice changePrice = new ChangePrice();
        if (args[0].equals("/сменитьцену")) {
            changePrice.sql(args[1], args[2]);
        }

    }
}