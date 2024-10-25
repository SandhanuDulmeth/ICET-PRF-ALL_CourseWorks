
import java.util.*;

class FashionShop {

    public static void main(String args[]) {

        FashionShopMAIN();

    }

    public static Scanner scanner = new Scanner(System.in);

    public static void FashionShopMAIN() {

        {
            String PrintFashionShop = "\r\n"
                    + "             /$$$$$$"
                    + "$$                 /"
                    + "$$       /$$        "
                    + "                    "
                    + "/$$$$$$  /$$        "
                    + "                  \r"
                    + "\n"
                    + "            | $$____"
                    + "_/                | "
                    + "$$      |__/        "
                    + "                   /"
                    + "$$__  $$| $$        "
                    + "                  \r"
                    + "\n"
                    + "            | $$    "
                    + "/$$$$$$   /$$$$$$$| "
                    + "$$$$$$$  /$$  /$$$$$"
                    + "$  /$$$$$$$       | "
                    + "$$  \\__/| $$$$$$$  "
                    + " /$$$$$$   /$$$$$$ "
                    + "\r\n"
                    + "            | $$$$$|"
                    + "____  $$ /$$_____/| "
                    + "$$__  $$| $$ /$$__  "
                    + "$$| $$__  $$      | "
                    + " $$$$$$ | $$__  $$ /"
                    + "$$__  $$ /$$__  $$\r"
                    + "\n"
                    + "            | $$__/ "
                    + "/$$$$$$$|  $$$$$$ | "
                    + "$$  \\ $$| $$| $$  "
                    + "\\ $$| $$  \\ $$    "
                    + "   \\____  $$| $$  "
                    + "\\ $$| $$  \\ $$| $$"
                    + "  \\ $$\r\n"
                    + "            | $$   /"
                    + "$$__  $$ \\____  $$|"
                    + " $$  | $$| $$| $$  |"
                    + " $$| $$  | $$       "
                    + "/$$  \\ $$| $$  | $$"
                    + "| $$  | $$| $$  | $$"
                    + "\r\n"
                    + "            | $$  | "
                    + " $$$$$$$ /$$$$$$$/| "
                    + "$$  | $$| $$|  $$$$$"
                    + "$/| $$  | $$      | "
                    + " $$$$$$/| $$  | $$| "
                    + " $$$$$$/| $$$$$$$/\r"
                    + "\n"
                    + "            |__/   "
                    + "\\_______/|_______/ "
                    + "|__/  |__/|__/ \\___"
                    + "___/ |__/  |__/     "
                    + "  \\______/ |__/  |_"
                    + "_/ \\______/ | $$___"
                    + "_/ \r\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + "                    "
                    + "                    "
                    + "        | $$      \r"
                    + "\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + "                    "
                    + "                    "
                    + "        | $$      \r"
                    + "\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + "                    "
                    + "                    "
                    + "        |__/      \r"
                    + "\n";

            System.out.println(PrintFashionShop);

        }

        System.out.println(
                "\t    __________________________________________________________________________________________________________");

        System.out.println("\n\t\t[1] Place Order                                         [2] Search Customer\n");
        System.out.println("\t\t[3] Search Order                                        [4] View Reports\n");
        System.out.println("\t\t[5] Set Order Status                                    [6] Delete Order\n");

        System.out.print("\n\t\tInput Option : ");
        int mainOption = scanner.nextInt();
        clearConsole();
        switch (mainOption) {
            case 1:
                PlaceOrder();
                break;
            case 2:
                SearchCustomer();
                break;
            case 3:
                SearchOrder();
                break;
            case 4:
                ViweReports();

                break;
            case 5:
                ChangeOrderStatus();
                break;
            case 6:
                DeleteOrder();
                break;

            default:

                FashionShopMAIN();

        }

    }

    public static int orderListNumber = 0;
    public static int QTY;
    public static double PlaceOrderSizePrice;
    public static double Amount;
    public static String PlaceOrderPhoneNumber;
    public static String PlaceOrderTShirtSize;

    public static int[] orderList = new int[0];
    public static String[] PhoneNumberList = new String[0];
    public static String[] ShirtSizeList = new String[0];
    public static int[] QTYList = new int[0];
    public static double[] AmountList = new double[0];
    public static int[] StatusList = new int[0];

    public static int[] integerArray(int[] integerlist, int integerItem) {
        int[] temp = new int[integerlist.length + 1];
        for (int i = 0; i < integerlist.length; i++) {
            temp[i] = integerlist[i];
        }
        integerlist = temp;
        integerlist[integerlist.length - 1] = ++integerItem;

        return integerlist;
        // orderList=integerlist;

    }

    public static void Arrays() {
        /*
         * //orderID
         * int[] temp0=new int[orderList.length+1];
         * for (int i = 0; i < orderList.length; i++)
         * {
         * temp0[i]=orderList[i];
         * }
         * orderList=temp0;
         * orderList[orderList.length-1]=++orderListNumber;
         * //System.out.println(Arrays.toString(orderList));
         */
        // PhoneNumber
        String[] temp1 = new String[PhoneNumberList.length + 1];
        for (int i = 0; i < PhoneNumberList.length; i++) {
            temp1[i] = PhoneNumberList[i];
        }
        PhoneNumberList = temp1;
        PhoneNumberList[PhoneNumberList.length - 1] = PlaceOrderPhoneNumber;
        // System.out.println(Arrays.toString(PhoneNumberList));

        // ShirtSizeList
        String[] temp2 = new String[ShirtSizeList.length + 1];
        for (int i = 0; i < ShirtSizeList.length; i++) {
            temp2[i] = ShirtSizeList[i];
        }
        ShirtSizeList = temp2;
        ShirtSizeList[ShirtSizeList.length - 1] = PlaceOrderTShirtSize;
        // System.out.println(Arrays.toString(ShirtSizeList)

        // QTYList
        int[] temp3 = new int[QTYList.length + 1];
        for (int i = 0; i < QTYList.length; i++) {
            temp3[i] = QTYList[i];
        }
        QTYList = temp3;
        QTYList[QTYList.length - 1] = QTY;
        // System.out.println(Arrays.toString(QTYList));

        // AmountList
        double[] temp4 = new double[AmountList.length + 1];
        for (int i = 0; i < AmountList.length; i++) {
            temp4[i] = AmountList[i];
        }
        AmountList = temp4;
        AmountList[AmountList.length - 1] = Amount;
        // System.out.println(Arrays.toString(AmountList));

        // Status
        int[] temp5 = new int[StatusList.length + 1];
        for (int i = 0; i < StatusList.length; i++) {
            temp5[i] = StatusList[i];
        }
        StatusList = temp5;
        StatusList[StatusList.length - 1] = 0;

    }

    public static void PlaceOrder() {
        ///////// ------01

        do {

            {
                String placeorderPrint = "\r\n"
                        + "      _____  _      "
                        + "             ____   "
                        + "       _            "
                        + "\r\n"
                        + "     |  __ \\| |    "
                        + "             / __ \\"
                        + "        | |         "
                        + "  \r\n"
                        + "     | |__) | | __ _"
                        + "  ___ ___  | |  | |_"
                        + " __ __| | ___ _ __  "
                        + "\r\n"
                        + "     |  ___/| |/ _` "
                        + "|/ __/ _ \\ | |  | |"
                        + " \'__/ _` |/ _ \\ \'"
                        + "__| \r\n"
                        + "     | |    | | (_| "
                        + "| (_|  __/ | |__| | "
                        + "| | (_| |  __/ |    "
                        + "\r\n"
                        + "     |_|    |_|\\__,"
                        + "_|\\___\\___|  \\___"
                        + "_/|_|  \\__,_|\\___|"
                        + "_|    \r\n"
                        + "                    "
                        + "                    "
                        + "                    "
                        + "\r\n"
                        + "                    "
                        + "                    "
                        + "                    "
                        + "\r\n";
                System.out.println(placeorderPrint);
                // Move the cursor up five lines
                System.out.print("\033[2A");
                // Clear the lines
                System.out.print("\033[0J");
                // SearchCustomer();
                System.out.println("     _____________________________________________________\n\n");
            }

            int i = orderListNumber + 1;

            for (; i < 1000;) {
                if (i < 10) {
                    System.out.println("\tEnter Order ID : ODR#0000" + i);
                    break;

                } else if (i >= 10 && i < 100) {
                    System.out.println("\tEnter Order ID : ODR#000" + i);
                    break;
                } else if (i >= 100 && i < 1000) {
                    System.out.println("\tEnter Order ID : ODR#00" + i);
                    break;
                } else if (i >= 1000 && i < 10000) {
                    System.out.println("\tEnter Order ID : ODR#0" + i);
                    break;
                } else if (i >= 10000) {
                    System.out.println("\tEnter Order ID : ODR#" + i);
                    break;
                }
                i++;
            }

            placeOrderPhone();

        } while (true);

    }

    public static void placeOrderPhone() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\tEnter Customer Phone Number : ");
        PlaceOrderPhoneNumber = scanner.next();

        if (PlaceOrderPhoneNumber.charAt(0) == '0' && PlaceOrderPhoneNumber.length() == 10) {

            PlaceOrderTshirt();

        } else {
            System.out.println("\n\t\tInvalid Phone number... Try again");
            boolean choice = yesNoChoice("\tDo you want to enter phone number again? (y/n) : ");

            if (choice) {
                // Move the cursor up five lines
                System.out.print("\033[6A");
                // Clear the lines
                System.out.print("\033[0J");
                placeOrderPhone();
            } else {
                clearConsole();

                FashionShopMAIN();

            }

        }

    }

    public static void PlaceOrderTshirt() {

        System.out.print("\n\tEnter T-Shirt Size (XS/S/M/L/XL/XXL) : ");
        PlaceOrderTShirtSize = scanner.next();

        switch (PlaceOrderTShirtSize) {
            case "XS":

                QTY = getPlaceOrderQTY();
                PlaceOrderSizePrice = 600;
                break;
            case "S":

                QTY = getPlaceOrderQTY();
                PlaceOrderSizePrice = 800;
                break;
            case "M":

                QTY = getPlaceOrderQTY();
                PlaceOrderSizePrice = 900;
                break;
            case "L":

                QTY = getPlaceOrderQTY();
                PlaceOrderSizePrice = 1000;
                break;
            case "XL":

                QTY = getPlaceOrderQTY();
                PlaceOrderSizePrice = 1100;
                break;
            case "XXL":

                QTY = getPlaceOrderQTY();
                PlaceOrderSizePrice = 1200;
                break;

            default:
                // Move the cursor up five lines
                System.out.print("\033[2A");
                // Clear the lines
                System.out.print("\033[0J");
                PlaceOrderTshirt();

        }
        Amount = QTY * PlaceOrderSizePrice;
        System.out.print("\n\tAmount : " + Amount);

        boolean choice = yesNoChoice("\n\n\tDo you want to place this order? (y/n) : ");

        if (choice) {
            System.out.print("\n\t\tOrder Placed..!");
            Arrays();

            orderList = integerArray(orderList, orderListNumber);
            ++orderListNumber;
            // System.out.println(Arrays.toString(orderList));
        }
        choice = yesNoChoice("\n\tDo you want to place another order? (y/n) : ");

        clearConsole();
        if (choice) {

            PlaceOrder();
        } else {
            clearConsole();

            FashionShopMAIN();
        }

    }

    public static int getPlaceOrderQTY() {

        System.out.print("\n\tEnter QTY : ");
        int PlaceOrderQTY = scanner.nextInt();
        if (PlaceOrderQTY <= 0) {

            // Move the cursor up five lines
            System.out.print("\033[2A");
            // Clear the lines
            System.out.print("\033[0J");
            return getPlaceOrderQTY();

        }

        return PlaceOrderQTY;
    }

    public static void SearchCustomer() {
        ///////// ------02

        boolean SearchCustomer = true;
        {
            String SearchCustomerPrint = "\r\n"
                    + "       _____        "
                    + "             _      "
                    + "  _____          _  "
                    + "                    "
                    + "      \r\n"
                    + "      / ____|       "
                    + "            | |     "
                    + " / ____|        | | "
                    + "                    "
                    + "      \r\n"
                    + "     | (___   ___  _"
                    + "_ _ _ __ ___| |__   "
                    + "| |    _   _ ___| |_"
                    + " ___  _ __ ___   ___"
                    + " _ __ \r\n"
                    + "      \\___ \\ / _ "
                    + "\\/ _` | \'__/ __| "
                    + "\'_ \\  | |   | | | "
                    + "/ __| __/ _ \\| \'_ "
                    + "` _ \\ / _ \\ \'__|"
                    + "\r\n"
                    + "      ____) |  __/ ("
                    + "_| | | | (__| | | | "
                    + "| |___| |_| \\__ \\ "
                    + "|| (_) | | | | | |  "
                    + "__/ |   \r\n"
                    + "     |_____/ \\___|"
                    + "\\__,_|_|  \\___|_| "
                    + "|_|  \\_____\\__,_|_"
                    + "__/\\__\\___/|_| |_|"
                    + " |_|\\___|_|   \r\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + "                    "
                    + "      \r\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + "                    "
                    + "      \r\n";
            System.out.println(SearchCustomerPrint);
            // Move the cursor up five lines
            System.out.print("\033[2A");
            // Clear the lines
            System.out.print("\033[0J");
            // SearchCustomer();
            System.out.println("    _________________________________________________________________________________");
        }

        System.out.print("\n\n\tEnter Customer Phone Number : ");
        String SearchCustomerPhoneNumber = scanner.next();

        if (SearchCustomerPhoneNumber.charAt(0) == '0' && SearchCustomerPhoneNumber.length() == 10) {

            int[] data = getCustomerReportData(SearchCustomerPhoneNumber);

            SearchCustomerTable(data);

            boolean choice = yesNoChoice("\n\n\n\tDo you want to search another customer report? (y/n) : ");

            if (choice) {
                clearConsole();
                SearchCustomer();
            } else {
                clearConsole();
                FashionShopMAIN();
            }

        } else {
            System.out.println("\n\t\tInvalid input...");
            boolean choice = yesNoChoice("\n\tDo you want to search another customer report?(y/n) : ");

            if (choice) {
                // Move the cursor up five lines
                System.out.print("\033[6A");
                // Clear the lines
                System.out.print("\033[0J");
                placeOrderPhone();
            } else {
                clearConsole();

                FashionShopMAIN();

            }

        }

    }

    public static int[] getCustomerReportData(String phone_number) {

        // {XS,S,M,L,XL,XXL}
        int[] data = new int[6];

        for (int i = 0; i < PhoneNumberList.length; i++) {
            System.out.print(Arrays.toString(PhoneNumberList));
            if (phone_number.equals(PhoneNumberList[i])) {

                switch (ShirtSizeList[i]) {
                    case "XS":
                        data[0] += QTYList[i];
                        break;
                    case "S":
                        data[1] += QTYList[i];
                        break;
                    case "M":
                        data[2] += QTYList[i];
                        break;
                    case "L":
                        data[3] += QTYList[i];
                        break;
                    case "XL":
                        data[4] += QTYList[i];
                        break;
                    case "XXL":
                        data[5] += QTYList[i];
                        break;
                    default:
                        break;
                }

            }
        }
        if (Arrays.equals(data, new int[] { 0, 0, 0, 0, 0, 0 })) {
            System.out.print("\n\t\tInvalid input...");
            boolean choice = yesNoChoice("\nDo you want to search another customer report? (y/n) : ");
            if (choice) {
                clearConsole();
                SearchCustomer();

            } else {
                clearConsole();
                FashionShopMAIN();
            }

        }

        System.out.println("customerReport : " + Arrays.toString(data));

        return data;

    }

    public static void SearchCustomerTable(int[] SearchCustomerList) {
        String[] Size = new String[] { "XS", "S", "M", "L", "XL", "XXL" };
        // Move the cursor up five lines
        System.out.print("\033[4A");
        // Clear the lines
        System.out.print("\033[0J");

        System.out.println("\n\n");
        System.out.printf("%s", "\t\t+----------+---------+---------------+");
        System.out.printf("%s", "\n\t\t|   Size   |  QTY    |    Amount     |");
        System.out.printf("%s", "\n\t\t+----------+---------+---------------+");

        double TotalSearchCustomer = 0;
        for (int i = 0; i < SearchCustomerList.length; i++) {
            System.out.printf("%s", "\n\t\t|          |         |               |");
            System.out.printf("%s%3s%s%3s%s%8.2f%s", "\n\t\t|    ", Size[i], "   |  ", SearchCustomerList[i],
                    "    |    ", Amount(Size[i], SearchCustomerList[i]), "   | ");

            TotalSearchCustomer += Amount(Size[i], SearchCustomerList[i]);

        }

        System.out.printf("%s", "\n\t\t|          |         |               |");
        System.out.printf("%s", "\n\t\t+----------+---------+---------------+");
        System.out.printf("%s%.2f%s", "\n\t\t|  Total Amount      |    ", TotalSearchCustomer, "    |");
        System.out.printf("%s", "\n\t\t+----------+---------+---------------+");

    }

    public static double Amount(String PlaceOrderTShirtSize, int QTYTShirt) {
        switch (PlaceOrderTShirtSize) {
            case "XS":
                PlaceOrderSizePrice = 600;
                break;
            case "S":
                PlaceOrderSizePrice = 800;
                break;
            case "M":
                PlaceOrderSizePrice = 900;
                break;
            case "L":
                PlaceOrderSizePrice = 1000;
                break;
            case "XL":
                PlaceOrderSizePrice = 1100;
                break;
            case "XXL":
                PlaceOrderSizePrice = 1200;
                break;
        }
        return QTYTShirt * PlaceOrderSizePrice;
    }

    public static void SearchOrder() {

        ///////// ------03

        {
            String searchOrderPrint = "\r\n"
                    + "       _____        "
                    + "             _      "
                    + "  ____          _   "
                    + "        \r\n"
                    + "      / ____|       "
                    + "            | |     "
                    + " / __ \\        | | "
                    + "         \r\n"
                    + "     | (___   ___  _"
                    + "_ _ _ __ ___| |__   "
                    + "| |  | |_ __ __| | _"
                    + "__ _ __ \r\n"
                    + "      \\___ \\ / _ "
                    + "\\/ _` | \'__/ __| "
                    + "\'_ \\  | |  | | \'_"
                    + "_/ _` |/ _ \\ \'__|"
                    + "\r\n"
                    + "      ____) |  __/ ("
                    + "_| | | | (__| | | | "
                    + "| |__| | | | (_| |  "
                    + "__/ |   \r\n"
                    + "     |_____/ \\___|"
                    + "\\__,_|_|  \\___|_| "
                    + "|_|  \\____/|_|  \\_"
                    + "_,_|\\___|_|   \r\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + "        \r\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + "        \r\n";
            System.out.print(searchOrderPrint);
            // Move the cursor up five lines
            System.out.print("\033[2A");
            // Clear the lines
            System.out.print("\033[0J");
            // SearchCustomer();
            System.out.print("   _________________________________________________________________");

        }

        SearchOrderPrintSearch();

    }

    public static void SearchOrderPrintSearch() {

        System.out.print("\n\n\n\tEnter order ID  : ");
        String OrderIDCheck = scanner.next();

        String SearchOrderID = "";

        if (OrderIDCheck.length() == 9 && OrderIDCheck.charAt(0) == 'O' && OrderIDCheck.charAt(1) == 'D'
                && OrderIDCheck.charAt(2) == 'R' && OrderIDCheck.charAt(3) == '#') {
            for (int i = 0; i < 5; i++) {
                SearchOrderID += (OrderIDCheck.charAt(4 + i));
            }

            int orderNumber = Integer.parseInt(SearchOrderID);

            for (int i = 0; i < orderList.length; i++) {
                if (orderNumber == orderList[i]) {
                    System.out.printf("%-18s%1s%d", "\n\tPhone Number", ":", orderList[i]);
                    System.out.printf("%-18s%1s%s", "\n\tSize", ":", ShirtSizeList[i]);
                    System.out.printf("%-18s%1s%d", "\n\tQTY", ":", QTYList[i]);
                    System.out.printf("%-18s%1s%.2f", "\n\tAmount", ":", AmountList[i]);
                    System.out.printf("%-18s%1s%s", "\n\tStatus", ":",
                            StatusList[i] == 0 ? "PROCESSING" : StatusList[i] == 1 ? "DELIVERING" : "DELIVERED");

                    boolean choice = yesNoChoice("\n\tDo you want to search another order?(y/n) : ");
                    if (choice) {
                        clearConsole();
                        SearchOrder();
                    } else {
                        clearConsole();
                        FashionShopMAIN();

                    }

                }
            }

            return;

        } else {
            System.out.print("\n\t\tInvalid ID..");

            boolean choice = yesNoChoice("\n\tDo you want to search another order?(y/n) : ");
            if (choice) {
                clearConsole();
                SearchOrder();
            } else {
                clearConsole();
                FashionShopMAIN();

            }

        }

    }

    public static void DeleteOrder() {

        ///////// ------06
        {

            String DeleteOrderPrint = "\r\n"
                    + "   _____       _    "
                    + "  _          ____   "
                    + "       _           "
                    + "\r\n"
                    + "  |  __ \\     | |  "
                    + "  | |        / __ \\"
                    + "        | |         "
                    + " \r\n"
                    + "  | |  | | ___| | __"
                    + "_| |_ ___  | |  | |_"
                    + " __ __| | ___ _ __ "
                    + "\r\n"
                    + "  | |  | |/ _ \\ |/ "
                    + "_ \\ __/ _ \\ | |  |"
                    + " | \'__/ _` |/ _ \\ "
                    + "\'__|\r\n"
                    + "  | |__| |  __/ |  _"
                    + "_/ ||  __/ | |__| | "
                    + "| | (_| |  __/ |   "
                    + "\r\n"
                    + "  |_____/ \\___|_|\\"
                    + "___|\\__\\___|  \\__"
                    + "__/|_|  \\__,_|\\___"
                    + "|_|   \r\n"
                    + "                    "
                    + "                    "
                    + "                   "
                    + "\r\n"
                    + "                    "
                    + "                    "
                    + "                   "
                    + "\r\n";

            System.out.print(DeleteOrderPrint);

            // Move the cursor up five lines
            System.out.print("\033[2A");
            // Clear the lines
            System.out.print("\033[0J");
            // SearchCustomer();
            System.out.print("  __________________________________________________________");

        }

        System.out.print("\n\n\n\tEnter order ID  : ");
        String OrderIDCheck = scanner.next();

        String SearchOrderID = "";
        int orderNumber = 0;

        if (OrderIDCheck.length() == 9 && OrderIDCheck.charAt(0) == 'O' && OrderIDCheck.charAt(1) == 'D'
                && OrderIDCheck.charAt(2) == 'R' && OrderIDCheck.charAt(3) == '#') {
            for (int i = 0; i < 5; i++) {
                SearchOrderID += (OrderIDCheck.charAt(4 + i));
            }

            orderNumber = Integer.parseInt(SearchOrderID);

            for (int i = 0; i < orderList.length; i++) {
                if (orderNumber == orderList[i]) {
                    System.out.printf("%-18s%1s%d", "\n\tPhone Number", ":", orderList[i]);
                    System.out.printf("%-18s%1s%s", "\n\tSize", ":", ShirtSizeList[i]);
                    System.out.printf("%-18s%1s%d", "\n\tQTY", ":", QTYList[i]);
                    System.out.printf("%-18s%1s%.2f", "\n\tAmount", ":", AmountList[i]);
                    System.out.printf("%-18s%1s%s", "\n\tStatus", ":",
                            StatusList[i] == 0 ? "PROCESSING" : StatusList[i] == 1 ? "DELIVERING" : "DELIVERED");

                }

            }

        } else {
            System.out.print("\n\t\tInvalid ID..");
            boolean choice = yesNoChoice("\n\tDo you want to search another order?(y/n) : ");
            if (choice) {
                clearConsole();
                DeleteOrder();
            } else {
                clearConsole();
                FashionShopMAIN();

            }

        }

        boolean choice = yesNoChoice("\n\n\tDo you want to delete this order? (y/n) : ");
        if (choice) {
            System.out.print("\n\n\t\tOrder Deleted..!");

            int[] temp6 = new int[orderList.length - 1];
            int k = 0;
            for (int i = 0; i < orderList.length; i++) {

                if (orderNumber != orderList[i]) {

                    temp6[k] = orderList[i];
                    ++k;
                }

            }
            orderList = temp6;

        }

        choice = yesNoChoice("\n\n\tDo you want to delete another order?(y/n) : ");
        if (choice) {
            clearConsole();
            DeleteOrder();
        } else {
            clearConsole();
            FashionShopMAIN();

        }

    }

    public static void ViweReports() {

        ///////// ------04
        {
            String ViweReportsPrint = "\r\n"
                    + "   _____            "
                    + "           _       "
                    + "\r\n"
                    + "  |  __ \\          "
                    + "           | |      "
                    + "\r\n"
                    + "  | |__) |___ _ __  "
                    + " ___  _ __| |_ ___ "
                    + "\r\n"
                    + "  |  _  // _ \\ \'_ "
                    + "\\ / _ \\| \'__| __/"
                    + " __|\r\n"
                    + "  | | \\ \\  __/ |_)"
                    + " | (_) | |  | |_\\__"
                    + " \\\r\n"
                    + "  |_|  \\_\\___| .__"
                    + "/ \\___/|_|   \\__|_"
                    + "__/\r\n"
                    + "             | |    "
                    + "                   "
                    + "\r\n"
                    + "             |_|    "
                    + "                   "
                    + "\r\n";

            System.out.print(ViweReportsPrint);
            // Move the cursor up five lines
            System.out.print("\033[2A");
            // Clear the lines
            System.out.print("\033[0J");
            // SearchCustomer();
            System.out.print("   ____________________________________");

        }

        System.out.println("\n\n\n\t[1] Customer Reports ");
        System.out.println("\n\t[2] Item Reports");
        System.out.println("\n\t[3] Orders Reports ");

        System.out.print("\nEnter Option : ");
        int ViweReportsOption = scanner.nextInt();

        switch (ViweReportsOption) {
            case 1:
                clearConsole();
                CustomerReports();

                break;
            case 2:
                clearConsole();
                ItemReports();

                break;
            case 3:
                clearConsole();
                OrdersReports();

                break;

            default:
                System.out.print("\n\n\t\tInvalid input..");
                boolean choice = yesNoChoice("\n\nDo you want to enter option again?(y/n) : ");
                if (choice) {
                    clearConsole();
                    ViweReports();
                } else {
                    clearConsole();
                    FashionShopMAIN();

                }
        }
    }

    public static void CustomerReports() {

        {
            String CustomerReportsPrint = "\r\n"
                    + "    _____          _"
                    + "                    "
                    + "          _____     "
                    + "                  _ "
                    + "      \r\n"
                    + "   / ____|        | "
                    + "|                   "
                    + "         |  __ \\   "
                    + "                  | "
                    + "|      \r\n"
                    + "  | |    _   _ ___| "
                    + "|_ ___  _ __ ___   _"
                    + "__ _ __  | |__) |___"
                    + " _ __   ___  _ __| |"
                    + "_ ___ \r\n"
                    + "  | |   | | | / __| "
                    + "__/ _ \\| \'_ ` _ \\"
                    + " / _ \\ \'__| |  _  "
                    + "// _ \\ \'_ \\ / _ "
                    + "\\| \'__| __/ __|\r"
                    + "\n"
                    + "  | |___| |_| \\__ "
                    + "\\ || (_) | | | | | "
                    + "|  __/ |    | | \\ "
                    + "\\  __/ |_) | (_) | "
                    + "|  | |_\\__ \\\r\n"
                    + "   \\_____\\__,_|___"
                    + "/\\__\\___/|_| |_| |"
                    + "_|\\___|_|    |_|  "
                    + "\\_\\___| .__/ \\___"
                    + "/|_|   \\__|___/\r\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + "| |                 "
                    + "      \r\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + "|_|                 "
                    + "      \r\n";

            System.out.print(CustomerReportsPrint);
            // Move the cursor up five lines
            System.out.print("\033[2A");
            // Clear the lines
            System.out.print("\033[0J");
            // SearchCustomer();
            System.out.print("   ________________________________________________________________________________");

        }

        System.out.println("\n\n\n\t[1] Best in Customers ");
        System.out.println("\n\t[2] View Customers");
        System.out.println("\n\t[3] All Customer Report ");

        System.out.print("\nEnter Option : ");
        int CustomerReportsOption = scanner.nextInt();

        switch (CustomerReportsOption) {
            case 1:
                clearConsole();
                BestInCustomers();
                break;
            case 2:
                clearConsole();
                ViewCustomers();
                break;
            case 3:
                clearConsole();
                AllCustomerReport();
                break;

            default:
                System.out.print("\n\n\t\tInvalid input..");
                boolean choice = yesNoChoice("\n\nDo you want to enter option again?(y/n) : ");
                if (choice) {
                    clearConsole();
                    CustomerReports();
                } else {
                    clearConsole();
                    ViweReports();

                }
        }
    }

    public static void BestInCustomers() {
        {
            String BestInCustomersPrint = "\r\n"
                    + "   ____            _"
                    + "     _____          "
                    + "_____          _    "
                    + "                    "
                    + "        \r\n"
                    + "  |  _ \\          |"
                    + " |   |_   _|        "
                    + "/ ____|        | |  "
                    + "                    "
                    + "         \r\n"
                    + "  | |_) | ___  ___| "
                    + "|_    | |  _ __   | "
                    + "|    _   _ ___| |_ _"
                    + "__  _ __ ___   ___ _"
                    + " __ ___ \r\n"
                    + "  |  _ < / _ \\/ __|"
                    + " __|   | | | \'_ \\ "
                    + " | |   | | | / __| _"
                    + "_/ _ \\| \'_ ` _ \\ "
                    + "/ _ \\ \'__/ __|\r\n"
                    + "  | |_) |  __/\\__ "
                    + "\\ |_   _| |_| | | |"
                    + " | |___| |_| \\__ \\"
                    + " || (_) | | | | | | "
                    + " __/ |  \\__ \\\r\n"
                    + "  |____/ \\___||___/"
                    + "\\__| |_____|_| |_| "
                    + " \\_____\\__,_|___/"
                    + "\\__\\___/|_| |_| |_"
                    + "|\\___|_|  |___/\r\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + "                    "
                    + "        \r\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + "                    "
                    + "        \r\n";

            System.out.print(BestInCustomersPrint);
            // Move the cursor up five lines
            System.out.print("\033[2A");
            // Clear the lines
            System.out.print("\033[0J");
            // SearchCustomer();
            System.out.print("   _________________________________________________________________");

        }

        String[][] BestInCustomersReportArrya = selectionSortAscendingCustomerReport2D(getCustomerReports2DArray());
        // System.out.print("\n\n"+Arrays.deepToString(BestInCustomersReportArrya));

        System.out.println("\n\n\t+---------------+----------+-----------------+");
        System.out.println("\t| Customer ID   | All QTY  | Total Amount    |");
        System.out.println("\t+---------------+----------+-----------------+");

        for (int i = 0; i < BestInCustomersReportArrya.length; i++) {
            int ALLQTY = 0;
            for (int j = 1; j < BestInCustomersReportArrya[i].length - 1; j++) {
                ALLQTY += Integer.parseInt(BestInCustomersReportArrya[i][j]);
            }

            System.out.printf("\t| %-13s | %-8d | %-15s |\n", BestInCustomersReportArrya[i][0], ALLQTY,
                    BestInCustomersReportArrya[i][7]);
        }

        System.out.println("\t+---------------+----------+-----------------+");

        checkNO0();
    }

    public static void ViewCustomers() {
        {
            String ViewCustomersPrint = "\r\n"
                    + "  __      ___       "
                    + "           _____    "
                    + "      _             "
                    + "                   "
                    + "\r\n"
                    + "  \\ \\    / (_)    "
                    + "            / ____| "
                    + "       | |          "
                    + "                    "
                    + " \r\n"
                    + "   \\ \\  / / _  ___"
                    + "__      __ | |    _ "
                    + "  _ ___| |_ ___  _ _"
                    + "_ ___   ___ _ __ ___"
                    + " \r\n"
                    + "    \\ \\/ / | |/ _ "
                    + "\\ \\ /\\ / / | |   "
                    + "| | | / __| __/ _ \\"
                    + "| \'_ ` _ \\ / _ \\ "
                    + "\'__/ __|\r\n"
                    + "     \\  /  | |  __/"
                    + "\\ V  V /  | |___| |"
                    + "_| \\__ \\ || (_) | "
                    + "| | | | |  __/ |  \\"
                    + "__ \\\r\n"
                    + "      \\/   |_|\\___"
                    + "| \\_/\\_/    \\____"
                    + "_\\__,_|___/\\__\\__"
                    + "_/|_| |_| |_|\\___|_"
                    + "|  |___/\r\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + "                   "
                    + "\r\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + "                   "
                    + "\r\n";

            System.out.print(ViewCustomersPrint);
            // Move the cursor up five lines
            System.out.print("\033[2A");
            // Clear the lines
            System.out.print("\033[0J");
            // SearchCustomer();
            System.out.print("   __________________________________________________________________________");

        }

        String[][] ViewCustomersReportArrya = getCustomerReports2DArray();

        System.out.print("\n\n");
        System.out.println("\t+---------------+---------+-----------------+");
        System.out.println("\t| Customer ID   | All QTY | Total Amount    |");
        System.out.println("\t+---------------+---------+-----------------+");

        for (int i = 0; i < ViewCustomersReportArrya.length; i++) {
            int ALLQTY = 0;
            for (int j = 1; j < ViewCustomersReportArrya[i].length - 1; j++) {
                ALLQTY += Integer.parseInt(ViewCustomersReportArrya[i][j]);
            }

            System.out.printf("\t| %-13s | %-8d | %-15s |\n", ViewCustomersReportArrya[i][0], ALLQTY,
                    ViewCustomersReportArrya[i][7]);
        }

        System.out.println("\t+---------------+----------+-----------------+");

        checkNO0();

    }

    public static void AllCustomerReport() {
        {
            String AllCustomerReportPrint = "\r\n"
                    + "            _ _    _"
                    + "____          _     "
                    + "                    "
                    + "     _____          "
                    + "             _   \r"
                    + "\n"
                    + "      /\\   | | |  /"
                    + " ____|        | |   "
                    + "                    "
                    + "     |  __ \\       "
                    + "              | |  "
                    + "\r\n"
                    + "     /  \\  | | | | "
                    + "|    _   _ ___| |_ _"
                    + "__  _ __ ___   ___ _"
                    + " __  | |__) |___ _ _"
                    + "_   ___  _ __| |_ \r"
                    + "\n"
                    + "    / /\\ \\ | | | |"
                    + " |   | | | / __| __/"
                    + " _ \\| \'_ ` _ \\ / "
                    + "_ \\ \'__| |  _  // "
                    + "_ \\ \'_ \\ / _ \\| "
                    + "\'__| __|\r\n"
                    + "   / ____ \\| | | | "
                    + "|___| |_| \\__ \\ ||"
                    + " (_) | | | | | |  __"
                    + "/ |    | | \\ \\  __"
                    + "/ |_) | (_) | |  | |"
                    + "_ \r\n"
                    + "  /_/    \\_\\_|_|  "
                    + "\\_____\\__,_|___/\\"
                    + "__\\___/|_| |_| |_|"
                    + "\\___|_|    |_|  \\_"
                    + "\\___| .__/ \\___/|_"
                    + "|   \\__|\r\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + "               | |  "
                    + "                 \r"
                    + "\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + "               |_|  "
                    + "                 \r"
                    + "\n";

            System.out.print(AllCustomerReportPrint);
            // Move the cursor up five lines
            System.out.print("\033[2A");
            // Clear the lines
            System.out.print("\033[0J");
            // SearchCustomer();
            System.out.print(
                    "   ____________________________________________________________________________________________");

        }

        String[][] AllCustomerReportArrya = getCustomerReports2DArray();

        System.out.println("\n\n\t+--------------+-----+-----+-----+-----+-----+-----+---------+");
        System.out.printf("\t| %-12s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-7s |\n", "Phone Number", "XS", "S",
                "M", "L", "XL", "XXL", "Total");
        System.out.println("\t+--------------+-----+-----+-----+-----+-----+-----+---------+");

        for (int i = 0; i < AllCustomerReportArrya.length; i++) {
            System.out.printf("\t| %-12s ", AllCustomerReportArrya[i][0]);
            for (int j = 1; j < AllCustomerReportArrya[i].length - 1; j++) {
                System.out.printf("| %3s ", AllCustomerReportArrya[i][j]);
            }
            System.out.printf("| %-8s|\n ", AllCustomerReportArrya[i][7]);
        }

        System.out.println("\t+--------------+-----+-----+-----+-----+-----+-----+---------+");

        checkNO0();

    }

    public static String[][] getCustomerReports2DArray() {

        int uniqueCount = 0;
        for (int i = 0; i < PhoneNumberList.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (PhoneNumberList[i].equals(PhoneNumberList[j])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }

        // temp=[{PhoneNumber},{XS},{S},{M},{L},{XL},{XXL},{Total}]
        String[][] temp = new String[uniqueCount][8];

        // input phoneNumbers & others "0"
        int index = 0;
        for (int i = 0; i < PhoneNumberList.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < index; j++) {
                if (temp[j][0].equals(PhoneNumberList[i])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[index][0] = PhoneNumberList[i];
                for (int k = 1; k <= 7; k++) {
                    temp[index][k] = "0";
                }
                index++;
            }
        }

        for (int i = 0; i < PhoneNumberList.length; i++) {
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j][0].equals(PhoneNumberList[i])) {
                    // Update quantities
                    switch (ShirtSizeList[i]) {
                        case "XS":
                            temp[j][1] = String.valueOf(Integer.parseInt(temp[j][1]) + QTYList[i]);
                            break;
                        case "S":
                            temp[j][2] = String.valueOf(Integer.parseInt(temp[j][2]) + QTYList[i]);
                            break;
                        case "M":
                            temp[j][3] = String.valueOf(Integer.parseInt(temp[j][3]) + QTYList[i]);
                            break;
                        case "L":
                            temp[j][4] = String.valueOf(Integer.parseInt(temp[j][4]) + QTYList[i]);
                            break;
                        case "XL":
                            temp[j][5] = String.valueOf(Integer.parseInt(temp[j][5]) + QTYList[i]);
                            break;
                        case "XXL":
                            temp[j][6] = String.valueOf(Integer.parseInt(temp[j][6]) + QTYList[i]);
                            break;

                    }

                    // Add the total
                    temp[j][7] = String.valueOf(Double.parseDouble(temp[j][7]) + AmountList[i]);
                }
            }
        }

        return temp;
    }

    public static void ItemReports() {
        {
            String ItemReportsPrint = "\r\n"
                    + "   _____ _          "
                    + "         _____      "
                    + "                 _  "
                    + "     \r\n"
                    + "  |_   _| |         "
                    + "        |  __ \\    "
                    + "                 | |"
                    + "      \r\n"
                    + "    | | | |_ ___ _ _"
                    + "_ ___   | |__) |___ "
                    + "_ __   ___  _ __| |_"
                    + " ___ \r\n"
                    + "    | | | __/ _ \\ "
                    + "\'_ ` _ \\  |  _  //"
                    + " _ \\ \'_ \\ / _ \\|"
                    + " \'__| __/ __|\r\n"
                    + "   _| |_| ||  __/ | "
                    + "| | | | | | \\ \\  _"
                    + "_/ |_) | (_) | |  | "
                    + "|_\\__ \\\r\n"
                    + "  |_____|\\__\\___|_"
                    + "| |_| |_| |_|  \\_\\"
                    + "___| .__/ \\___/|_| "
                    + "  \\__|___/\r\n"
                    + "                    "
                    + "                   |"
                    + " |                  "
                    + "     \r\n"
                    + "                    "
                    + "                   |"
                    + "_|                  "
                    + "     \r\n";

            System.out.print(ItemReportsPrint);
            // Move the cursor up five lines
            System.out.print("\033[2A");
            // Clear the lines
            System.out.print("\033[0J");
            // SearchCustomer();
            System.out.print("   _______________________________________________________________");

        }

        System.out.println("\n\n\n\t[1] Best Selling Categories Sorted by QTY ");
        System.out.println("\n\t[2] Best Selling Categories Sorted by Amount");

        System.out.print("\nEnter Option : ");
        int ItemReportsOption = scanner.nextInt();

        switch (ItemReportsOption) {
            case 1:
                clearConsole();
                SortedByQTY();

                break;
            case 2:
                clearConsole();
                SortedByAmount();

                break;

            default:
                System.out.print("\n\n\t\tInvalid input..");
                boolean choice = yesNoChoice("\n\nDo you want to enter option again?(y/n) : ");
                if (choice) {
                    clearConsole();
                    ItemReports();
                } else {
                    clearConsole();
                    FashionShopMAIN();

                }
        }

    }

    public static void SortedByQTY() {
        {
            String SortedByQTYPrint = "\r\n"
                    + "    _____           "
                    + " _           _   ___"
                    + "_           ____ ___"
                    + "______     __\r\n"
                    + "   / ____|          "
                    + "| |         | | |  _"
                    + " \\         / __ \\_"
                    + "_   __\\ \\   / /\r"
                    + "\n"
                    + "  | (___   ___  _ __"
                    + "| |_ ___  __| | | |_"
                    + ") |_   _  | |  | | |"
                    + " |   \\ \\_/ / \r\n"
                    + "   \\___ \\ / _ \\| "
                    + "\'__| __/ _ \\/ _` |"
                    + " |  _ <| | | | | |  "
                    + "| | | |    \\   /  "
                    + "\r\n"
                    + "   ____) | (_) | |  "
                    + "| ||  __/ (_| | | |_"
                    + ") | |_| | | |__| | |"
                    + " |     | |   \r\n"
                    + "  |_____/ \\___/|_| "
                    + "  \\__\\___|\\__,_| "
                    + "|____/ \\__, |  \\__"
                    + "_\\_\\ |_|     |_|  "
                    + " \r\n"
                    + "                    "
                    + "                    "
                    + "    __/ |           "
                    + "             \r\n"
                    + "                    "
                    + "                    "
                    + "   |___/            "
                    + "             \r\n";

            System.out.print(SortedByQTYPrint);
            // Move the cursor up five lines
            System.out.print("\033[2A");
            // Clear the lines
            System.out.print("\033[0J");
            // SearchCustomer();
            System.out.print("   ____________________________________________________________________");

        }

        String[][] SortedByQTY2DArray = selectionSortAsecendingItemReportQTY2D(getItemReports2DArray());

        // System.out.print(Arrays.deepToString(SortedByQTY2DArray));
        System.out.println("\n\n\t+------+-----+-------------+");
        System.out.println("\t| Size | QTY | Total Amount|");
        System.out.println("\t+------+-----+-------------+");

        for (int i = 0; i < 6; i++) {
            System.out.printf("\t| %-4s | %-3s | %11s |\n", SortedByQTY2DArray[i][0], SortedByQTY2DArray[i][1],
                    SortedByQTY2DArray[i][2]);
        }

        System.out.println("\t+------+-----+-------------+");

        checkNO0();
    }

    public static void SortedByAmount() {
        {
            String SortedByAmountPrint = "\r\n"
                    + "    _____           "
                    + " _           _   ___"
                    + "_                   "
                    + "                    "
                    + "        _   \r\n"
                    + "   / ____|          "
                    + "| |         | | |  _"
                    + " \\            /\\  "
                    + "                    "
                    + "         | |  \r\n"
                    + "  | (___   ___  _ __"
                    + "| |_ ___  __| | | |_"
                    + ") |_   _     /  \\  "
                    + " _ __ ___   ___  _  "
                    + " _ _ __ | |_ \r\n"
                    + "   \\___ \\ / _ \\| "
                    + "\'__| __/ _ \\/ _` |"
                    + " |  _ <| | | |   / /"
                    + "\\ \\ | \'_ ` _ \\ /"
                    + " _ \\| | | | \'_ \\|"
                    + " __|\r\n"
                    + "   ____) | (_) | |  "
                    + "| ||  __/ (_| | | |_"
                    + ") | |_| |  / ____ \\"
                    + "| | | | | | (_) | |_"
                    + "| | | | | |_ \r\n"
                    + "  |_____/ \\___/|_| "
                    + "  \\__\\___|\\__,_| "
                    + "|____/ \\__, | /_/  "
                    + "  \\_\\_| |_| |_|\\_"
                    + "__/ \\__,_|_| |_|\\_"
                    + "_|\r\n"
                    + "                    "
                    + "                    "
                    + "    __/ |           "
                    + "                    "
                    + "            \r\n"
                    + "                    "
                    + "                    "
                    + "   |___/            "
                    + "                    "
                    + "            \r\n";
            System.out.print(SortedByAmountPrint);
            // Move the cursor up five lines
            System.out.print("\033[2A");
            // Clear the lines
            System.out.print("\033[0J");
            // SearchCustomer();
            System.out.print(
                    "   _______________________________________________________________________________________");

        }

        String[][] SortedByAmount2DArray = selectionSortAsecendingItemReportAmount2D(getItemReports2DArray());
        // System.out.print(Arrays.deepToString(SortedByAmount2DArray));

        System.out.println("\n\n\t+------+-----+-------------+");
        System.out.println("\t| Size | QTY | Total Amount|");
        System.out.println("\t+------+-----+-------------+");

        for (int i = 0; i < 6; i++) {
            System.out.printf("\t| %-4s | %-3s | %11s |\n", SortedByAmount2DArray[i][0], SortedByAmount2DArray[i][1],
                    SortedByAmount2DArray[i][2]);
        }

        System.out.println("\t+------+-----+-------------+");

        checkNO0();
    }

    public static String[][] getItemReports2DArray() {
        // [{Size},{XS,S,M,L,XL,XXL-->QTY},{Amount}]
        String[][] ItemReportsDATA = new String[6][3];

        ItemReportsDATA[0][0] = "XS";
        ItemReportsDATA[1][0] = "S";
        ItemReportsDATA[2][0] = "M";
        ItemReportsDATA[3][0] = "L";
        ItemReportsDATA[4][0] = "XL";
        ItemReportsDATA[5][0] = "XXL";

        for (int i = 0; i < 6; i++) {
            ItemReportsDATA[i][1] = "0";
            ItemReportsDATA[i][2] = "0";
        }

        for (int i = 0; i < PhoneNumberList.length; i++) {

            switch (ShirtSizeList[i]) {
                case "XS":
                    ItemReportsDATA[0][1] = String.valueOf(Integer.parseInt(ItemReportsDATA[0][1]) + QTYList[i]);
                    ItemReportsDATA[0][2] = String.valueOf(Double.parseDouble(ItemReportsDATA[0][2]) + AmountList[i]);
                    break;
                case "S":
                    ItemReportsDATA[1][1] = String.valueOf(Integer.parseInt(ItemReportsDATA[1][1]) + QTYList[i]);
                    ItemReportsDATA[1][2] = String.valueOf(Double.parseDouble(ItemReportsDATA[1][2]) + AmountList[i]);
                    break;
                case "M":
                    ItemReportsDATA[2][1] = String.valueOf(Integer.parseInt(ItemReportsDATA[2][1]) + QTYList[i]);
                    ItemReportsDATA[2][2] = String.valueOf(Double.parseDouble(ItemReportsDATA[2][2]) + AmountList[i]);
                    break;
                case "L":
                    ItemReportsDATA[3][1] = String.valueOf(Integer.parseInt(ItemReportsDATA[3][1]) + QTYList[i]);
                    ItemReportsDATA[3][2] = String.valueOf(Double.parseDouble(ItemReportsDATA[3][2]) + AmountList[i]);
                    break;
                case "XL":
                    ItemReportsDATA[4][1] = String.valueOf(Integer.parseInt(ItemReportsDATA[4][1]) + QTYList[i]);
                    ItemReportsDATA[4][2] = String.valueOf(Double.parseDouble(ItemReportsDATA[4][2]) + AmountList[i]);
                    break;
                case "XXL":
                    ItemReportsDATA[5][1] = String.valueOf(Integer.parseInt(ItemReportsDATA[5][1]) + QTYList[i]);
                    ItemReportsDATA[5][2] = String.valueOf(Double.parseDouble(ItemReportsDATA[5][2]) + AmountList[i]);
                    break;
            }
        }

        return ItemReportsDATA;
    }

    public static void OrdersReports() {
        {
            String OrdersReportsPrint = "\r\n"
                    + "    _____           "
                    + " _           _   ___"
                    + "_                   "
                    + "                    "
                    + "        _   \r\n"
                    + "   / ____|          "
                    + "| |         | | |  _"
                    + " \\            /\\  "
                    + "                    "
                    + "         | |  \r\n"
                    + "  | (___   ___  _ __"
                    + "| |_ ___  __| | | |_"
                    + ") |_   _     /  \\  "
                    + " _ __ ___   ___  _  "
                    + " _ _ __ | |_ \r\n"
                    + "   \\___ \\ / _ \\| "
                    + "\'__| __/ _ \\/ _` |"
                    + " |  _ <| | | |   / /"
                    + "\\ \\ | \'_ ` _ \\ /"
                    + " _ \\| | | | \'_ \\|"
                    + " __|\r\n"
                    + "   ____) | (_) | |  "
                    + "| ||  __/ (_| | | |_"
                    + ") | |_| |  / ____ \\"
                    + "| | | | | | (_) | |_"
                    + "| | | | | |_ \r\n"
                    + "  |_____/ \\___/|_| "
                    + "  \\__\\___|\\__,_| "
                    + "|____/ \\__, | /_/  "
                    + "  \\_\\_| |_| |_|\\_"
                    + "__/ \\__,_|_| |_|\\_"
                    + "_|\r\n"
                    + "                    "
                    + "                    "
                    + "    __/ |           "
                    + "                    "
                    + "            \r\n"
                    + "                    "
                    + "                    "
                    + "   |___/            "
                    + "                    "
                    + "            \r\n";

            System.out.print(OrdersReportsPrint);

            System.out.print(
                    "   _________________________________________________________________________________________");

        }

        System.out.println("\n\n\n\t[1] All Orders");
        System.out.println("\n\t[2] Orders By Amount");

        System.out.print("\nEnter Option : ");
        int ItemReportsOption = scanner.nextInt();

        switch (ItemReportsOption) {
            case 1:
                clearConsole();
                AllOrders();

                break;
            case 2:
                clearConsole();
                OrdersByAmount();

                break;

            default:
                System.out.print("\n\n\t\tInvalid input..");
                boolean choice = yesNoChoice("\n\nDo you want to enter option again?(y/n) : ");
                if (choice) {
                    clearConsole();
                    OrdersReports();
                } else {
                    clearConsole();
                    FashionShopMAIN();

                }
        }
    }

    public static void AllOrders() {
        {
            String AllOrdersPrint = "\r\n"
                    + "  __      ___       "
                    + "           ____     "
                    + "     _              "
                    + " \r\n"
                    + "  \\ \\    / (_)    "
                    + "            / __ \\ "
                    + "       | |          "
                    + "    \r\n"
                    + "   \\ \\  / / _  ___"
                    + "__      __ | |  | |_"
                    + " __ __| | ___ _ __ _"
                    + "__ \r\n"
                    + "    \\ \\/ / | |/ _ "
                    + "\\ \\ /\\ / / | |  |"
                    + " | \'__/ _` |/ _ \\ "
                    + "\'__/ __|\r\n"
                    + "     \\  /  | |  __/"
                    + "\\ V  V /  | |__| | "
                    + "| | (_| |  __/ |  \\"
                    + "__ \\\r\n"
                    + "      \\/   |_|\\___"
                    + "| \\_/\\_/    \\____"
                    + "/|_|  \\__,_|\\___|_"
                    + "|  |___/\r\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + " \r\n"
                    + "                    "
                    + "                    "
                    + "                    "
                    + " \r\n";
            System.out.print(AllOrdersPrint);
            // Move the cursor up five lines
            System.out.print("\033[2A");
            // Clear the lines
            System.out.print("\033[0J");
            // SearchCustomer();
            System.out.print("   _________________________________________________________");

        }

        String[][] ALLOrderArray = selectionSortDescendingOrderReport2D(getOrdersReports2DArray());

        System.out.println("\n\n\t+------------+--------------+-------+-----+----------+-------------+");
        System.out.println("\t| Order ID   | Customer ID  | Size  | QTY | Amount   | Status      |");
        System.out.println("\t+------------+--------------+-------+-----+----------+-------------+");

        for (int i = 0; i < orderList.length; i++) {

            int k = Integer.parseInt(ALLOrderArray[i][0]);
            String OrderID = "";
            if (k < 10) {
                OrderID = "ODR#0000" + k;

            } else if (k >= 10 && k < 100) {
                OrderID = "ODR#000" + k;
                ;
            } else if (k >= 100 && k < 1000) {
                OrderID = "ODR#00" + k;

            } else if (k >= 1000 && k < 10000) {
                OrderID = "ODR#0" + k;

            } else if (k >= 10000) {
                OrderID = "ODR#" + k;

            }

            System.out.printf("\t| %-10s | %-12s | %-5s | %-3s | %-8s | %-11s |\n", OrderID, ALLOrderArray[i][1],
                    ALLOrderArray[i][2], ALLOrderArray[i][3], ALLOrderArray[i][4], ALLOrderArray[i][5]);
        }

        System.out.println("\t+------------+--------------+-------+-----+----------+-------------+");

        checkNO0();
    }

    public static void OrdersByAmount() {
        {
            String OrdersByAmountPrint = "\r\n"
                    + "    ____          _ "
                    + "                ____"
                    + "                    "
                    + "                    "
                    + "       _   \r\n"
                    + "   / __ \\        | "
                    + "|               |  _"
                    + " \\            /\\  "
                    + "                    "
                    + "         | |  \r\n"
                    + "  | |  | |_ __ __| |"
                    + " ___ _ __ ___  | |_)"
                    + " |_   _     /  \\   "
                    + "_ __ ___   ___  _   "
                    + "_ _ __ | |_ \r\n"
                    + "  | |  | | \'__/ _` "
                    + "|/ _ \\ \'__/ __| | "
                    + " _ <| | | |   / /\\ "
                    + "\\ | \'_ ` _ \\ / _ "
                    + "\\| | | | \'_ \\| __"
                    + "|\r\n"
                    + "  | |__| | | | (_| |"
                    + "  __/ |  \\__ \\ | |"
                    + "_) | |_| |  / ____ "
                    + "\\| | | | | | (_) | "
                    + "|_| | | | | |_ \r\n"
                    + "   \\____/|_|  \\__,"
                    + "_|\\___|_|  |___/ |_"
                    + "___/ \\__, | /_/    "
                    + "\\_\\_| |_| |_|\\___"
                    + "/ \\__,_|_| |_|\\__|"
                    + "\r\n"
                    + "                    "
                    + "                    "
                    + "   __/ |            "
                    + "                    "
                    + "           \r\n"
                    + "                    "
                    + "                    "
                    + "  |___/             "
                    + "                    "
                    + "           \r\n";
            System.out.print(OrdersByAmountPrint);

            System.out
                    .print("   ______________________________________________________________________________________");
        }

        String[][] ALLOrderArray = selectionSortDescendingOrderReportAmount2D(getOrdersReports2DArray());

        System.out.println("\n\n\t+------------+--------------+-------+-----+----------+-------------+");
        System.out.println("\t| Order ID   | Customer ID  | Size  | QTY | Amount   | Status      |");
        System.out.println("\t+------------+--------------+-------+-----+----------+-------------+");

        for (int i = 0; i < orderList.length; i++) {

            int k = Integer.parseInt(ALLOrderArray[i][0]);
            String OrderID = "";
            if (k < 10) {
                OrderID = "ODR#0000" + k;

            } else if (k >= 10 && k < 100) {
                OrderID = "ODR#000" + k;
                ;
            } else if (k >= 100 && k < 1000) {
                OrderID = "ODR#00" + k;

            } else if (k >= 1000 && k < 10000) {
                OrderID = "ODR#0" + k;

            } else if (k >= 10000) {
                OrderID = "ODR#" + k;

            }

            System.out.printf("\t| %-10s | %-12s | %-5s | %-3s | %-8s | %-11s |\n", OrderID, ALLOrderArray[i][1],
                    ALLOrderArray[i][2], ALLOrderArray[i][3], ALLOrderArray[i][4], ALLOrderArray[i][5]);
        }

        System.out.println("\t+------------+--------------+-------+-----+----------+-------------+");

        checkNO0();
    }

    public static String[][] getOrdersReports2DArray() {
        // [{OrderID},{CustID},{Size},{QTY},{Amount},{Status}]
        String[][] OrdersReports2DArray = new String[PhoneNumberList.length][6];

        for (int i = 0; i < PhoneNumberList.length; i++) {
            OrdersReports2DArray[i][0] = String.valueOf(orderList[i]);
            OrdersReports2DArray[i][1] = String.valueOf(PhoneNumberList[i]);
            OrdersReports2DArray[i][2] = String.valueOf(ShirtSizeList[i]);
            OrdersReports2DArray[i][3] = String.valueOf(QTYList[i]);
            OrdersReports2DArray[i][4] = String.valueOf(AmountList[i]);

            OrdersReports2DArray[i][5] = StatusList[i] == 0 ? "PROCESSING"
                    : StatusList[i] == 1 ? "DELIVERING" : "DELIVERED";

        }

        return OrdersReports2DArray;

    }

    public static void checkNO0() {

        System.out.print("\n\n\nTo access the main Menu, please enter 0 :");
        // System.out.print("\n");
        if (0 == scanner.nextInt()) {
            clearConsole();
            FashionShopMAIN();
        } else {
            System.out.print("\033[4A");
            // Clear the lines
            System.out.print("\033[0J");
            // SearchCustomer();

            checkNO0();
        }
    }

    public static String[][] selectionSortAscendingCustomerReport2D(String[][] temp) {

        for (int i = 0; i < temp.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < temp.length; j++) {

                double currentTotal = Double.parseDouble(temp[j][7]);
                double minTotal = Double.parseDouble(temp[minIndex][7]);
                if (currentTotal > minTotal) {
                    minIndex = j;
                }
            }

            String[] tempRow = temp[i];
            temp[i] = temp[minIndex];
            temp[minIndex] = tempRow;
        }

        return temp;
    }

    public static String[][] selectionSortAsecendingItemReportQTY2D(String[][] temp) {

        for (int i = 0; i < temp.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < temp.length; j++) {

                double currentQTY = Integer.parseInt(temp[j][1]);
                double minQTY = Integer.parseInt(temp[minIndex][1]);
                if (currentQTY > minQTY) {
                    minIndex = j;
                }
            }

            String[] tempRow = temp[i];
            temp[i] = temp[minIndex];
            temp[minIndex] = tempRow;
        }

        return temp;

    }

    public static String[][] selectionSortAsecendingItemReportAmount2D(String[][] temp) {

        for (int i = 0; i < temp.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < temp.length; j++) {

                double currentAmount = Double.parseDouble(temp[j][2]);
                double minAmount = Double.parseDouble(temp[minIndex][2]);
                if (currentAmount > minAmount) {
                    minIndex = j;
                }
            }

            String[] tempRow = temp[i];
            temp[i] = temp[minIndex];
            temp[minIndex] = tempRow;
        }

        return temp;

    }

    public static String[][] selectionSortDescendingOrderReport2D(String[][] temp) {

        for (int i = 0; i < temp.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < temp.length; j++) {

                int currentID = Integer.parseInt(temp[j][0]);
                int minID = Integer.parseInt(temp[minIndex][0]);
                if (currentID > minID) {
                    minIndex = j;
                }
            }

            String[] tempRow = temp[i];
            temp[i] = temp[minIndex];
            temp[minIndex] = tempRow;
        }

        return temp;

    }

    public static String[][] selectionSortDescendingOrderReportAmount2D(String[][] temp) {

        for (int i = 0; i < temp.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < temp.length; j++) {

                double currentID = Double.parseDouble(temp[j][4]);
                double minID = Double.parseDouble(temp[minIndex][4]);
                if (currentID > minID) {
                    minIndex = j;
                }
            }

            String[] tempRow = temp[i];
            temp[i] = temp[minIndex];
            temp[minIndex] = tempRow;
        }

        return temp;

    }

    public static void ChangeOrderStatus() {

        ///////// ------05
        {
            String ChangeOrderStatusPrint = "\r\n"
                    + "    ____      _     "
                    + "         _____ _    "
                    + "    _             \r"
                    + "\n"
                    + "   / __ \\    | |   "
                    + "         / ____| |  "
                    + "    | |            "
                    + "\r\n"
                    + "  | |  | | __| | ___"
                    + " _ __  | (___ | |_ _"
                    + "_ _| |_ _   _ ___ \r"
                    + "\n"
                    + "  | |  | |/ _` |/ _ "
                    + "\\ \'__|  \\___ \\| "
                    + "__/ _` | __| | | / _"
                    + "_|\r\n"
                    + "  | |__| | (_| |  __"
                    + "/ |     ____) | || ("
                    + "_| | |_| |_| \\__ \\"
                    + "\r\n"
                    + "   \\____/ \\__,_|\\"
                    + "___|_|    |_____/ \\"
                    + "__\\__,_|\\__|\\__,_"
                    + "|___/\r\n"
                    + "                    "
                    + "                    "
                    + "                  \r"
                    + "\n"
                    + "                    "
                    + "                    "
                    + "                  \r"
                    + "\n";
            System.out.print(ChangeOrderStatusPrint);
            // Move the cursor up five lines
            System.out.print("\033[2A");
            // Clear the lines
            System.out.print("\033[0J");
            // SearchCustomer();
            System.out.print("   ____________________________________");

        }

        System.out.print("\n\n\n\tEnter order ID  : ");
        String OrderIDCheck = scanner.next();

        String SearchOrderID = "";

        if (OrderIDCheck.length() == 9 && OrderIDCheck.charAt(0) == 'O' && OrderIDCheck.charAt(1) == 'D'
                && OrderIDCheck.charAt(2) == 'R' && OrderIDCheck.charAt(3) == '#') {
            for (int i = 0; i < 5; i++) {
                SearchOrderID += (OrderIDCheck.charAt(4 + i));
            }

            int orderNumber = Integer.parseInt(SearchOrderID);

            for (int i = 0; i < orderList.length; i++) {
                if (orderNumber == orderList[i]) {
                    System.out.printf("%-18s%1s%d", "\n\tPhone Number", ":", orderList[i]);
                    System.out.printf("%-18s%1s%s", "\n\tSize", ":", ShirtSizeList[i]);
                    System.out.printf("%-18s%1s%d", "\n\tQTY", ":", QTYList[i]);
                    System.out.printf("%-18s%1s%.2f", "\n\tAmount", ":", AmountList[i]);
                    System.out.printf("%-18s%1s%s", "\n\tStatus", ":",
                            StatusList[i] == 0 ? "PROCESSING" : StatusList[i] == 1 ? "DELIVERING" : "DELIVERED");

                    if (StatusList[i] == 0) {
                        boolean choice2 = yesNoChoice("\n\nDo you want to change this order status? (y/n)  : ");

                        if (choice2) {
                            System.out.println("\n\t\t[1] Order Delivering");
                            System.out.println("\t\t[2] Order Delivered");
                            EnterOption(i);
                        }

                    } else if (StatusList[i] == 1) {
                        System.out.println("\n\t\t[1] Order Delivering");
                        EnterOption2(i);

                    } else if (StatusList[i] == 2) {
                        System.out.print("\n\t\tCan't change this order status, Order already deliverd..! '");
                    }

                    boolean choice = yesNoChoice("\n\tDo you want to Change another order status?(y/n) : ");
                    if (choice) {
                        clearConsole();
                        ChangeOrderStatus();
                    } else {
                        clearConsole();
                        FashionShopMAIN();

                    }

                }
            }

        } else {
            System.out.print("\n\t\tInvalid ID..");

            boolean choice = yesNoChoice("\n\tDo you want to change another order?(y/n) : ");
            if (choice) {
                clearConsole();
                ChangeOrderStatus();
            } else {
                clearConsole();
                FashionShopMAIN();

            }

        }
    }

    public static void EnterOption(int i) {

        System.out.print("Enter option : ");
        int option = scanner.nextInt();
        if (option == 1) {
            StatusList[i] = 1;
        } else if (option == 2) {
            StatusList[i] = 2;
        } else {
            System.out.print("\n\t\tInvalid Input\n\n");
            EnterOption(i);
        }
    }

    public static void EnterOption2(int i) {

        System.out.print("Enter option : ");
        int option = scanner.nextInt();
        if (option == 1) {
            StatusList[i] = 1;
        } else {
            System.out.print("\n\t\tInvalid Input\n\n");
            EnterOption2(i);
        }
    }

    public static boolean yesNoChoice(String text) {

        System.out.print("\n" + text);
        char choice = scanner.next().toLowerCase().charAt(0);

        return choice == 'y' ? true : false;

    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
            // Handle any exceptions.
        }
    }

}
