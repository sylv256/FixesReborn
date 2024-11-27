package gay.sylv.fixes_reborn.fixin_impl;

import net.fabricmc.loader.api.FabricLoader;

public final class Impl_ServerPlayerEntityScreenHandlerHelper {
	public static final String INTERMEDIARY_NAMESPACE = "intermediary";
	public static final String SERVER_PLAYER_ENTITY_INTERMEDIARY_NAME = "net.minecraft.class_3222";
	public static final String INTERMEDIARY_FIELD_NAME = "field_29183";

	public static final String INTERMEDIARY_ANON_CLASS_NAME = SERVER_PLAYER_ENTITY_INTERMEDIARY_NAME + "$2";
	public static final String FIELD_DESC = "L" + SERVER_PLAYER_ENTITY_INTERMEDIARY_NAME.replace('.', '/') + ";";
	public static final String CLASS_NAME = FabricLoader.getInstance().getMappingResolver().mapClassName(INTERMEDIARY_NAMESPACE, INTERMEDIARY_ANON_CLASS_NAME);
	public static final String FIELD_NAME = FabricLoader.getInstance().getMappingResolver().mapFieldName(INTERMEDIARY_NAMESPACE, INTERMEDIARY_ANON_CLASS_NAME, INTERMEDIARY_FIELD_NAME, FIELD_DESC);
	
	private Impl_ServerPlayerEntityScreenHandlerHelper() {}
}
