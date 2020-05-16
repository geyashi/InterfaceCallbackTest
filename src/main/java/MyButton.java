public class MyButton {

    private OnClickListener listener;

    /**
     * Set the specific click listener
     * @param listener Click on the listener implementation class
     */
    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }


    /**
     * The button is clicked
     */
    public void doClick() {
        if (listener != null) {
            listener.onClick("haha");
        }

    }
}
