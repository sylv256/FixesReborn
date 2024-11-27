package gay.sylv.fixes_reborn.fixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import reborncore.common.screen.ServerPlayerEntityScreenHandlerHelper;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

import static gay.sylv.fixes_reborn.fixin_impl.Impl_ServerPlayerEntityScreenHandlerHelper.CLASS_NAME;
import static gay.sylv.fixes_reborn.fixin_impl.Impl_ServerPlayerEntityScreenHandlerHelper.FIELD_NAME;

/// Fixes brittle, non-portable code that uses worst practices.
/// This replaces the code with portable, best-practice code.
@Mixin(ServerPlayerEntityScreenHandlerHelper.class)
public class Fixin_ServerPlayerEntityScreenHandlerHelper {
	@WrapOperation(
			method = "<clinit>",
			at = @At(
					value = "INVOKE",
					target = "Ljava/lang/Class;forName(Ljava/lang/String;)Ljava/lang/Class;"
			)
	)
	private static Class<?> fixForName(String className, Operation<Class<?>> original) {
		return original.call(CLASS_NAME);
	}
	
	@WrapOperation(
			method = "<clinit>",
			at = @At(
					value = "INVOKE",
					target = "Ljava/lang/invoke/MethodHandles$Lookup;findVarHandle(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/invoke/VarHandle;"
			)
	)
	private static VarHandle fixFindVarHandle(MethodHandles.Lookup instance, Class<?> receiver, String name, Class<?> type, Operation<VarHandle> original) {
		return original.call(instance, receiver, FIELD_NAME, type);
	}
}
