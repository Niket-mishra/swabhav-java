public class ItalianHotel implements IHotel{
    @Override
    public IMenu getMenu() {
        return new ItalianMenu();
    }
}
