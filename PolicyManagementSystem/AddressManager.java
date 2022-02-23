public class AddressManager {

    public static void addAddress(User user, IAddress address) {
        user.getIAddressArrayList().add(address);
    }

    public static void removeAddress(User user, IAddress address) {
        user.getIAddressArrayList().remove(address);
    }

}
