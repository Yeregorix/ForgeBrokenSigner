module net.smoofyuniverse.fbs {
    requires org.spongepowered.configurate;
    requires net.minecraftforge.bootstrap.api;

    provides net.minecraftforge.bootstrap.api.BootstrapEntryPoint with net.smoofyuniverse.fbs.BootstrapEntry;
}