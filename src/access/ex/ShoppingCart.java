package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount > items.length) {
            System.out.println("장바구니가 꽉 찼습니다.");
        } else {
            items[itemCount] = item;
            itemCount++;
        }
    }

    public void displayItems() {
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명:" + items[i].getName() + ", 합계:" + items[i].ProductTotalPrice());
        }
        System.out.println("전체 가격 합: " + totalCartPrice());
    }

    private int totalCartPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.ProductTotalPrice();
        }
        return totalPrice;
    }
}
