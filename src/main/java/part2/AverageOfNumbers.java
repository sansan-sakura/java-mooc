Scanner scanner = new Scanner(System.in);
int sum = 0;
int count = 0;

        while(true){
                System.out.println("Give a number:");
int input = Integer.valueOf(scanner.nextLine());

            if(input == 0){
        break;
        }

sum = sum + input;
count++;
        }

double average =(double) sum/count;
        System.out.println("Average of the numbers: " + average);


    }