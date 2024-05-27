// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

/**
 * {@snippet lang=c :
 * struct WGPUInstanceExtras {
 *     WGPUChainedStruct chain;
 *     WGPUInstanceBackendFlags backends;
 *     WGPUInstanceFlags flags;
 *     WGPUDx12Compiler dx12ShaderCompiler;
 *     WGPUGles3MinorVersion gles3MinorVersion;
 *     const char *dxilPath;
 *     const char *dxcPath;
 * }
 * }
 */
public class WGPUInstanceExtras {

    WGPUInstanceExtras() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        WGPUChainedStruct.layout().withName("chain"),
        wgpu_h.C_INT.withName("backends"),
        wgpu_h.C_INT.withName("flags"),
        wgpu_h.C_INT.withName("dx12ShaderCompiler"),
        wgpu_h.C_INT.withName("gles3MinorVersion"),
        wgpu_h.C_POINTER.withName("dxilPath"),
        wgpu_h.C_POINTER.withName("dxcPath")
    ).withName("WGPUInstanceExtras");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout chain$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("chain"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUChainedStruct chain
     * }
     */
    public static final GroupLayout chain$layout() {
        return chain$LAYOUT;
    }

    private static final long chain$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUChainedStruct chain
     * }
     */
    public static final long chain$offset() {
        return chain$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUChainedStruct chain
     * }
     */
    public static MemorySegment chain(MemorySegment struct) {
        return struct.asSlice(chain$OFFSET, chain$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUChainedStruct chain
     * }
     */
    public static void chain(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, chain$OFFSET, chain$LAYOUT.byteSize());
    }

    private static final OfInt backends$LAYOUT = (OfInt)$LAYOUT.select(groupElement("backends"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUInstanceBackendFlags backends
     * }
     */
    public static final OfInt backends$layout() {
        return backends$LAYOUT;
    }

    private static final long backends$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUInstanceBackendFlags backends
     * }
     */
    public static final long backends$offset() {
        return backends$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUInstanceBackendFlags backends
     * }
     */
    public static int backends(MemorySegment struct) {
        return struct.get(backends$LAYOUT, backends$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUInstanceBackendFlags backends
     * }
     */
    public static void backends(MemorySegment struct, int fieldValue) {
        struct.set(backends$LAYOUT, backends$OFFSET, fieldValue);
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUInstanceFlags flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUInstanceFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUInstanceFlags flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUInstanceFlags flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final OfInt dx12ShaderCompiler$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dx12ShaderCompiler"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUDx12Compiler dx12ShaderCompiler
     * }
     */
    public static final OfInt dx12ShaderCompiler$layout() {
        return dx12ShaderCompiler$LAYOUT;
    }

    private static final long dx12ShaderCompiler$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUDx12Compiler dx12ShaderCompiler
     * }
     */
    public static final long dx12ShaderCompiler$offset() {
        return dx12ShaderCompiler$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUDx12Compiler dx12ShaderCompiler
     * }
     */
    public static int dx12ShaderCompiler(MemorySegment struct) {
        return struct.get(dx12ShaderCompiler$LAYOUT, dx12ShaderCompiler$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUDx12Compiler dx12ShaderCompiler
     * }
     */
    public static void dx12ShaderCompiler(MemorySegment struct, int fieldValue) {
        struct.set(dx12ShaderCompiler$LAYOUT, dx12ShaderCompiler$OFFSET, fieldValue);
    }

    private static final OfInt gles3MinorVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("gles3MinorVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUGles3MinorVersion gles3MinorVersion
     * }
     */
    public static final OfInt gles3MinorVersion$layout() {
        return gles3MinorVersion$LAYOUT;
    }

    private static final long gles3MinorVersion$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUGles3MinorVersion gles3MinorVersion
     * }
     */
    public static final long gles3MinorVersion$offset() {
        return gles3MinorVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUGles3MinorVersion gles3MinorVersion
     * }
     */
    public static int gles3MinorVersion(MemorySegment struct) {
        return struct.get(gles3MinorVersion$LAYOUT, gles3MinorVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUGles3MinorVersion gles3MinorVersion
     * }
     */
    public static void gles3MinorVersion(MemorySegment struct, int fieldValue) {
        struct.set(gles3MinorVersion$LAYOUT, gles3MinorVersion$OFFSET, fieldValue);
    }

    private static final AddressLayout dxilPath$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dxilPath"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *dxilPath
     * }
     */
    public static final AddressLayout dxilPath$layout() {
        return dxilPath$LAYOUT;
    }

    private static final long dxilPath$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *dxilPath
     * }
     */
    public static final long dxilPath$offset() {
        return dxilPath$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *dxilPath
     * }
     */
    public static MemorySegment dxilPath(MemorySegment struct) {
        return struct.get(dxilPath$LAYOUT, dxilPath$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *dxilPath
     * }
     */
    public static void dxilPath(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dxilPath$LAYOUT, dxilPath$OFFSET, fieldValue);
    }

    private static final AddressLayout dxcPath$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dxcPath"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *dxcPath
     * }
     */
    public static final AddressLayout dxcPath$layout() {
        return dxcPath$LAYOUT;
    }

    private static final long dxcPath$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *dxcPath
     * }
     */
    public static final long dxcPath$offset() {
        return dxcPath$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *dxcPath
     * }
     */
    public static MemorySegment dxcPath(MemorySegment struct) {
        return struct.get(dxcPath$LAYOUT, dxcPath$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *dxcPath
     * }
     */
    public static void dxcPath(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dxcPath$LAYOUT, dxcPath$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

