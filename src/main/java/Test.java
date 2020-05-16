public class Test {

    public static void main(String[] args) {
        MyButton myButton = new MyButton();

        myButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(String s) {
                System.out.println("The button was clicked!");
                System.out.println(s);
            }
        });

        myButton.doClick();
    }

}
