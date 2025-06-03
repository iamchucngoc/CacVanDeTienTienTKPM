
package task.pkg8;

class CountInput extends OrderComponent {
    private int count;

    public void setCount(int count) {
        this.count = count;
        changed("countChanged");
    }

    public int getCount() {
        return count;
    }
}