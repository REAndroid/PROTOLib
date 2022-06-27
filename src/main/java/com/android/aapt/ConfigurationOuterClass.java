//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.android.aapt;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter;
import com.google.protobuf.Internal.EnumLiteMap;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ConfigurationOuterClass {
    private static final Descriptor internal_static_aapt_pb_Configuration_descriptor;
    private static final FieldAccessorTable internal_static_aapt_pb_Configuration_fieldAccessorTable;
    private static FileDescriptor descriptor;

    private ConfigurationOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }

    public static FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        java.lang.String[] descriptorData = new java.lang.String[]{"\n\u0013Configuration.proto\u0012\u0007aapt.pb\"Ù\u0014\n\rConfiguration\u0012\u000b\n\u0003mcc\u0018\u0001 \u0001(\r\u0012\u000b\n\u0003mnc\u0018\u0002 \u0001(\r\u0012\u000e\n\u0006locale\u0018\u0003 \u0001(\t\u0012@\n\u0010layout_direction\u0018\u0004 \u0001(\u000e2&.aapt.pb.Configuration.LayoutDirection\u0012\u0014\n\fscreen_width\u0018\u0005 \u0001(\r\u0012\u0015\n\rscreen_height\u0018\u0006 \u0001(\r\u0012\u0017\n\u000fscreen_width_dp\u0018\u0007 \u0001(\r\u0012\u0018\n\u0010screen_height_dp\u0018\b \u0001(\r\u0012 \n\u0018smallest_screen_width_dp\u0018\t \u0001(\r\u0012C\n\u0012screen_layout_size\u0018\n \u0001(\u000e2'.aapt.pb.Configuration.ScreenLayoutSize\u0012C\n\u0012screen_layout_long\u0018\u000b \u0001(\u000e2'.aapt.pb.Configuration.ScreenLayoutLong\u00128\n\fscreen_round\u0018\f \u0001(\u000e2\".aapt.pb.Configuration.ScreenRound\u0012?\n\u0010wide_color_gamut\u0018\r \u0001(\u000e2%.aapt.pb.Configuration.WideColorGamut\u0012'\n\u0003hdr\u0018\u000e \u0001(\u000e2\u001a.aapt.pb.Configuration.Hdr\u00127\n\u000borientation\u0018\u000f \u0001(\u000e2\".aapt.pb.Configuration.Orientation\u00127\n\fui_mode_type\u0018\u0010 \u0001(\u000e2!.aapt.pb.Configuration.UiModeType\u00129\n\rui_mode_night\u0018\u0011 \u0001(\u000e2\".aapt.pb.Configuration.UiModeNight\u0012\u000f\n\u0007density\u0018\u0012 \u0001(\r\u00127\n\u000btouchscreen\u0018\u0013 \u0001(\u000e2\".aapt.pb.Configuration.Touchscreen\u00126\n\u000bkeys_hidden\u0018\u0014 \u0001(\u000e2!.aapt.pb.Configuration.KeysHidden\u00121\n\bkeyboard\u0018\u0015 \u0001(\u000e2\u001f.aapt.pb.Configuration.Keyboard\u00124\n\nnav_hidden\u0018\u0016 \u0001(\u000e2 .aapt.pb.Configuration.NavHidden\u00125\n\nnavigation\u0018\u0017 \u0001(\u000e2!.aapt.pb.Configuration.Navigation\u0012\u0013\n\u000bsdk_version\u0018\u0018 \u0001(\r\u0012\u000f\n\u0007product\u0018\u0019 \u0001(\t\"a\n\u000fLayoutDirection\u0012\u001a\n\u0016LAYOUT_DIRECTION_UNSET\u0010\u0000\u0012\u0018\n\u0014LAYOUT_DIRECTION_LTR\u0010\u0001\u0012\u0018\n\u0014LAYOUT_DIRECTION_RTL\u0010\u0002\"ª\u0001\n\u0010ScreenLayoutSize\u0012\u001c\n\u0018SCREEN_LAYOUT_SIZE_UNSET\u0010\u0000\u0012\u001c\n\u0018SCREEN_LAYOUT_SIZE_SMALL\u0010\u0001\u0012\u001d\n\u0019SCREEN_LAYOUT_SIZE_NORMAL\u0010\u0002\u0012\u001c\n\u0018SCREEN_LAYOUT_SIZE_LARGE\u0010\u0003\u0012\u001d\n\u0019SCREEN_LAYOUT_SIZE_XLARGE\u0010\u0004\"m\n\u0010ScreenLayoutLong\u0012\u001c\n\u0018SCREEN_LAYOUT_LONG_UNSET\u0010\u0000\u0012\u001b\n\u0017SCREEN_LAYOUT_LONG_LONG\u0010\u0001\u0012\u001e\n\u001aSCREEN_LAYOUT_LONG_NOTLONG\u0010\u0002\"X\n\u000bScreenRound\u0012\u0016\n\u0012SCREEN_ROUND_UNSET\u0010\u0000\u0012\u0016\n\u0012SCREEN_ROUND_ROUND\u0010\u0001\u0012\u0019\n\u0015SCREEN_ROUND_NOTROUND\u0010\u0002\"h\n\u000eWideColorGamut\u0012\u001a\n\u0016WIDE_COLOR_GAMUT_UNSET\u0010\u0000\u0012\u001b\n\u0017WIDE_COLOR_GAMUT_WIDECG\u0010\u0001\u0012\u001d\n\u0019WIDE_COLOR_GAMUT_NOWIDECG\u0010\u0002\"3\n\u0003Hdr\u0012\r\n\tHDR_UNSET\u0010\u0000\u0012\u000e\n\nHDR_HIGHDR\u0010\u0001\u0012\r\n\tHDR_LOWDR\u0010\u0002\"h\n\u000bOrientation\u0012\u0015\n\u0011ORIENTATION_UNSET\u0010\u0000\u0012\u0014\n\u0010ORIENTATION_PORT\u0010\u0001\u0012\u0014\n\u0010ORIENTATION_LAND\u0010\u0002\u0012\u0016\n\u0012ORIENTATION_SQUARE\u0010\u0003\"×\u0001\n\nUiModeType\u0012\u0016\n\u0012UI_MODE_TYPE_UNSET\u0010\u0000\u0012\u0017\n\u0013UI_MODE_TYPE_NORMAL\u0010\u0001\u0012\u0015\n\u0011UI_MODE_TYPE_DESK\u0010\u0002\u0012\u0014\n\u0010UI_MODE_TYPE_CAR\u0010\u0003\u0012\u001b\n\u0017UI_MODE_TYPE_TELEVISION\u0010\u0004\u0012\u001a\n\u0016UI_MODE_TYPE_APPLIANCE\u0010\u0005\u0012\u0016\n\u0012UI_MODE_TYPE_WATCH\u0010\u0006\u0012\u001a\n\u0016UI_MODE_TYPE_VRHEADSET\u0010\u0007\"[\n\u000bUiModeNight\u0012\u0017\n\u0013UI_MODE_NIGHT_UNSET\u0010\u0000\u0012\u0017\n\u0013UI_MODE_NIGHT_NIGHT\u0010\u0001\u0012\u001a\n\u0016UI_MODE_NIGHT_NOTNIGHT\u0010\u0002\"m\n\u000bTouchscreen\u0012\u0015\n\u0011TOUCHSCREEN_UNSET\u0010\u0000\u0012\u0017\n\u0013TOUCHSCREEN_NOTOUCH\u0010\u0001\u0012\u0016\n\u0012TOUCHSCREEN_STYLUS\u0010\u0002\u0012\u0016\n\u0012TOUCHSCREEN_FINGER\u0010\u0003\"v\n\nKeysHidden\u0012\u0015\n\u0011KEYS_HIDDEN_UNSET\u0010\u0000\u0012\u001b\n\u0017KEYS_HIDDEN_KEYSEXPOSED\u0010\u0001\u0012\u001a\n\u0016KEYS_HIDDEN_KEYSHIDDEN\u0010\u0002\u0012\u0018\n\u0014KEYS_HIDDEN_KEYSSOFT\u0010\u0003\"`\n\bKeyboard\u0012\u0012\n\u000eKEYBOARD_UNSET\u0010\u0000\u0012\u0013\n\u000fKEYBOARD_NOKEYS\u0010\u0001\u0012\u0013\n\u000fKEYBOARD_QWERTY\u0010\u0002\u0012\u0016\n\u0012KEYBOARD_TWELVEKEY\u0010\u0003\"V\n\tNavHidden\u0012\u0014\n\u0010NAV_HIDDEN_UNSET\u0010\u0000\u0012\u0019\n\u0015NAV_HIDDEN_NAVEXPOSED\u0010\u0001\u0012\u0018\n\u0014NAV_HIDDEN_NAVHIDDEN\u0010\u0002\"}\n\nNavigation\u0012\u0014\n\u0010NAVIGATION_UNSET\u0010\u0000\u0012\u0014\n\u0010NAVIGATION_NONAV\u0010\u0001\u0012\u0013\n\u000fNAVIGATION_DPAD\u0010\u0002\u0012\u0018\n\u0014NAVIGATION_TRACKBALL\u0010\u0003\u0012\u0014\n\u0010NAVIGATION_WHEEL\u0010\u0004B\u0012\n\u0010com.android.aaptb\u0006proto3"};
        descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new FileDescriptor[0]);
        internal_static_aapt_pb_Configuration_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
        internal_static_aapt_pb_Configuration_fieldAccessorTable = new FieldAccessorTable(internal_static_aapt_pb_Configuration_descriptor, new java.lang.String[]{"Mcc", "Mnc", "Locale", "LayoutDirection", "ScreenWidth", "ScreenHeight", "ScreenWidthDp", "ScreenHeightDp", "SmallestScreenWidthDp", "ScreenLayoutSize", "ScreenLayoutLong", "ScreenRound", "WideColorGamut", "Hdr", "Orientation", "UiModeType", "UiModeNight", "Density", "Touchscreen", "KeysHidden", "Keyboard", "NavHidden", "Navigation", "SdkVersion", "Product"});
    }

    public static final class Configuration extends GeneratedMessageV3 implements ConfigurationOuterClass.ConfigurationOrBuilder {
        private static final long serialVersionUID = 0L;
        public static final int MCC_FIELD_NUMBER = 1;
        private int mcc_;
        public static final int MNC_FIELD_NUMBER = 2;
        private int mnc_;
        public static final int LOCALE_FIELD_NUMBER = 3;
        private volatile Object locale_;
        public static final int LAYOUT_DIRECTION_FIELD_NUMBER = 4;
        private int layoutDirection_;
        public static final int SCREEN_WIDTH_FIELD_NUMBER = 5;
        private int screenWidth_;
        public static final int SCREEN_HEIGHT_FIELD_NUMBER = 6;
        private int screenHeight_;
        public static final int SCREEN_WIDTH_DP_FIELD_NUMBER = 7;
        private int screenWidthDp_;
        public static final int SCREEN_HEIGHT_DP_FIELD_NUMBER = 8;
        private int screenHeightDp_;
        public static final int SMALLEST_SCREEN_WIDTH_DP_FIELD_NUMBER = 9;
        private int smallestScreenWidthDp_;
        public static final int SCREEN_LAYOUT_SIZE_FIELD_NUMBER = 10;
        private int screenLayoutSize_;
        public static final int SCREEN_LAYOUT_LONG_FIELD_NUMBER = 11;
        private int screenLayoutLong_;
        public static final int SCREEN_ROUND_FIELD_NUMBER = 12;
        private int screenRound_;
        public static final int WIDE_COLOR_GAMUT_FIELD_NUMBER = 13;
        private int wideColorGamut_;
        public static final int HDR_FIELD_NUMBER = 14;
        private int hdr_;
        public static final int ORIENTATION_FIELD_NUMBER = 15;
        private int orientation_;
        public static final int UI_MODE_TYPE_FIELD_NUMBER = 16;
        private int uiModeType_;
        public static final int UI_MODE_NIGHT_FIELD_NUMBER = 17;
        private int uiModeNight_;
        public static final int DENSITY_FIELD_NUMBER = 18;
        private int density_;
        public static final int TOUCHSCREEN_FIELD_NUMBER = 19;
        private int touchscreen_;
        public static final int KEYS_HIDDEN_FIELD_NUMBER = 20;
        private int keysHidden_;
        public static final int KEYBOARD_FIELD_NUMBER = 21;
        private int keyboard_;
        public static final int NAV_HIDDEN_FIELD_NUMBER = 22;
        private int navHidden_;
        public static final int NAVIGATION_FIELD_NUMBER = 23;
        private int navigation_;
        public static final int SDK_VERSION_FIELD_NUMBER = 24;
        private int sdkVersion_;
        public static final int PRODUCT_FIELD_NUMBER = 25;
        private volatile Object product_;
        private byte memoizedIsInitialized;
        private static final ConfigurationOuterClass.Configuration DEFAULT_INSTANCE = new ConfigurationOuterClass.Configuration();
        private static final Parser<ConfigurationOuterClass.Configuration> PARSER = new AbstractParser<ConfigurationOuterClass.Configuration>() {
            public ConfigurationOuterClass.Configuration parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ConfigurationOuterClass.Configuration(input, extensionRegistry);
            }
        };

        private Configuration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Configuration() {
            this.memoizedIsInitialized = -1;
            this.locale_ = "";
            this.layoutDirection_ = 0;
            this.screenLayoutSize_ = 0;
            this.screenLayoutLong_ = 0;
            this.screenRound_ = 0;
            this.wideColorGamut_ = 0;
            this.hdr_ = 0;
            this.orientation_ = 0;
            this.uiModeType_ = 0;
            this.uiModeNight_ = 0;
            this.touchscreen_ = 0;
            this.keysHidden_ = 0;
            this.keyboard_ = 0;
            this.navHidden_ = 0;
            this.navigation_ = 0;
            this.product_ = "";
        }

        @Override
        public Object newInstance(UnusedPrivateParameter unused) {
            return new ConfigurationOuterClass.Configuration();
        }

        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Configuration(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            } else {
                com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

                try {
                    boolean done = false;

                    while(!done) {
                        int tag = input.readTag();
                        java.lang.String s;
                        int rawValue;
                        switch(tag) {
                            case 0:
                                done = true;
                                break;
                            case 8:
                                this.mcc_ = input.readUInt32();
                                break;
                            case 16:
                                this.mnc_ = input.readUInt32();
                                break;
                            case 26:
                                s = input.readStringRequireUtf8();
                                this.locale_ = s;
                                break;
                            case 32:
                                rawValue = input.readEnum();
                                this.layoutDirection_ = rawValue;
                                break;
                            case 40:
                                this.screenWidth_ = input.readUInt32();
                                break;
                            case 48:
                                this.screenHeight_ = input.readUInt32();
                                break;
                            case 56:
                                this.screenWidthDp_ = input.readUInt32();
                                break;
                            case 64:
                                this.screenHeightDp_ = input.readUInt32();
                                break;
                            case 72:
                                this.smallestScreenWidthDp_ = input.readUInt32();
                                break;
                            case 80:
                                rawValue = input.readEnum();
                                this.screenLayoutSize_ = rawValue;
                                break;
                            case 88:
                                rawValue = input.readEnum();
                                this.screenLayoutLong_ = rawValue;
                                break;
                            case 96:
                                rawValue = input.readEnum();
                                this.screenRound_ = rawValue;
                                break;
                            case 104:
                                rawValue = input.readEnum();
                                this.wideColorGamut_ = rawValue;
                                break;
                            case 112:
                                rawValue = input.readEnum();
                                this.hdr_ = rawValue;
                                break;
                            case 120:
                                rawValue = input.readEnum();
                                this.orientation_ = rawValue;
                                break;
                            case 128:
                                rawValue = input.readEnum();
                                this.uiModeType_ = rawValue;
                                break;
                            case 136:
                                rawValue = input.readEnum();
                                this.uiModeNight_ = rawValue;
                                break;
                            case 144:
                                this.density_ = input.readUInt32();
                                break;
                            case 152:
                                rawValue = input.readEnum();
                                this.touchscreen_ = rawValue;
                                break;
                            case 160:
                                rawValue = input.readEnum();
                                this.keysHidden_ = rawValue;
                                break;
                            case 168:
                                rawValue = input.readEnum();
                                this.keyboard_ = rawValue;
                                break;
                            case 176:
                                rawValue = input.readEnum();
                                this.navHidden_ = rawValue;
                                break;
                            case 184:
                                rawValue = input.readEnum();
                                this.navigation_ = rawValue;
                                break;
                            case 192:
                                this.sdkVersion_ = input.readUInt32();
                                break;
                            case 202:
                                s = input.readStringRequireUtf8();
                                this.product_ = s;
                                break;
                            default:
                                if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                        }
                    }
                } catch (InvalidProtocolBufferException var11) {
                    throw var11.setUnfinishedMessage(this);
                } catch (IOException var12) {
                    throw (new InvalidProtocolBufferException(var12)).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    this.makeExtensionsImmutable();
                }

            }
        }

        public static final Descriptor getDescriptor() {
            return ConfigurationOuterClass.internal_static_aapt_pb_Configuration_descriptor;
        }

        public FieldAccessorTable internalGetFieldAccessorTable() {
            return ConfigurationOuterClass.internal_static_aapt_pb_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationOuterClass.Configuration.class, ConfigurationOuterClass.Configuration.Builder.class);
        }

        public int getMcc() {
            return this.mcc_;
        }

        public int getMnc() {
            return this.mnc_;
        }

        public java.lang.String getLocale() {
            Object ref = this.locale_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.locale_ = s;
                return s;
            }
        }

        public ByteString getLocaleBytes() {
            Object ref = this.locale_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.locale_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public int getLayoutDirectionValue() {
            return this.layoutDirection_;
        }

        public ConfigurationOuterClass.Configuration.LayoutDirection getLayoutDirection() {
            ConfigurationOuterClass.Configuration.LayoutDirection result = ConfigurationOuterClass.Configuration.LayoutDirection.valueOf(this.layoutDirection_);
            return result == null ? ConfigurationOuterClass.Configuration.LayoutDirection.UNRECOGNIZED : result;
        }

        public int getScreenWidth() {
            return this.screenWidth_;
        }

        public int getScreenHeight() {
            return this.screenHeight_;
        }

        public int getScreenWidthDp() {
            return this.screenWidthDp_;
        }

        public int getScreenHeightDp() {
            return this.screenHeightDp_;
        }

        public int getSmallestScreenWidthDp() {
            return this.smallestScreenWidthDp_;
        }

        public int getScreenLayoutSizeValue() {
            return this.screenLayoutSize_;
        }

        public ConfigurationOuterClass.Configuration.ScreenLayoutSize getScreenLayoutSize() {
            ConfigurationOuterClass.Configuration.ScreenLayoutSize result = ConfigurationOuterClass.Configuration.ScreenLayoutSize.valueOf(this.screenLayoutSize_);
            return result == null ? ConfigurationOuterClass.Configuration.ScreenLayoutSize.UNRECOGNIZED : result;
        }

        public int getScreenLayoutLongValue() {
            return this.screenLayoutLong_;
        }

        public ConfigurationOuterClass.Configuration.ScreenLayoutLong getScreenLayoutLong() {
            ConfigurationOuterClass.Configuration.ScreenLayoutLong result = ConfigurationOuterClass.Configuration.ScreenLayoutLong.valueOf(this.screenLayoutLong_);
            return result == null ? ConfigurationOuterClass.Configuration.ScreenLayoutLong.UNRECOGNIZED : result;
        }

        public int getScreenRoundValue() {
            return this.screenRound_;
        }

        public ConfigurationOuterClass.Configuration.ScreenRound getScreenRound() {
            ConfigurationOuterClass.Configuration.ScreenRound result = ConfigurationOuterClass.Configuration.ScreenRound.valueOf(this.screenRound_);
            return result == null ? ConfigurationOuterClass.Configuration.ScreenRound.UNRECOGNIZED : result;
        }

        public int getWideColorGamutValue() {
            return this.wideColorGamut_;
        }

        public ConfigurationOuterClass.Configuration.WideColorGamut getWideColorGamut() {
            ConfigurationOuterClass.Configuration.WideColorGamut result = ConfigurationOuterClass.Configuration.WideColorGamut.valueOf(this.wideColorGamut_);
            return result == null ? ConfigurationOuterClass.Configuration.WideColorGamut.UNRECOGNIZED : result;
        }

        public int getHdrValue() {
            return this.hdr_;
        }

        public ConfigurationOuterClass.Configuration.Hdr getHdr() {
            ConfigurationOuterClass.Configuration.Hdr result = ConfigurationOuterClass.Configuration.Hdr.valueOf(this.hdr_);
            return result == null ? ConfigurationOuterClass.Configuration.Hdr.UNRECOGNIZED : result;
        }

        public int getOrientationValue() {
            return this.orientation_;
        }

        public ConfigurationOuterClass.Configuration.Orientation getOrientation() {
            ConfigurationOuterClass.Configuration.Orientation result = ConfigurationOuterClass.Configuration.Orientation.valueOf(this.orientation_);
            return result == null ? ConfigurationOuterClass.Configuration.Orientation.UNRECOGNIZED : result;
        }

        public int getUiModeTypeValue() {
            return this.uiModeType_;
        }

        public ConfigurationOuterClass.Configuration.UiModeType getUiModeType() {
            ConfigurationOuterClass.Configuration.UiModeType result = ConfigurationOuterClass.Configuration.UiModeType.valueOf(this.uiModeType_);
            return result == null ? ConfigurationOuterClass.Configuration.UiModeType.UNRECOGNIZED : result;
        }

        public int getUiModeNightValue() {
            return this.uiModeNight_;
        }

        public ConfigurationOuterClass.Configuration.UiModeNight getUiModeNight() {
            ConfigurationOuterClass.Configuration.UiModeNight result = ConfigurationOuterClass.Configuration.UiModeNight.valueOf(this.uiModeNight_);
            return result == null ? ConfigurationOuterClass.Configuration.UiModeNight.UNRECOGNIZED : result;
        }

        public int getDensity() {
            return this.density_;
        }

        public int getTouchscreenValue() {
            return this.touchscreen_;
        }

        public ConfigurationOuterClass.Configuration.Touchscreen getTouchscreen() {
            ConfigurationOuterClass.Configuration.Touchscreen result = ConfigurationOuterClass.Configuration.Touchscreen.valueOf(this.touchscreen_);
            return result == null ? ConfigurationOuterClass.Configuration.Touchscreen.UNRECOGNIZED : result;
        }

        public int getKeysHiddenValue() {
            return this.keysHidden_;
        }

        public ConfigurationOuterClass.Configuration.KeysHidden getKeysHidden() {
            ConfigurationOuterClass.Configuration.KeysHidden result = ConfigurationOuterClass.Configuration.KeysHidden.valueOf(this.keysHidden_);
            return result == null ? ConfigurationOuterClass.Configuration.KeysHidden.UNRECOGNIZED : result;
        }

        public int getKeyboardValue() {
            return this.keyboard_;
        }

        public ConfigurationOuterClass.Configuration.Keyboard getKeyboard() {
            ConfigurationOuterClass.Configuration.Keyboard result = ConfigurationOuterClass.Configuration.Keyboard.valueOf(this.keyboard_);
            return result == null ? ConfigurationOuterClass.Configuration.Keyboard.UNRECOGNIZED : result;
        }

        public int getNavHiddenValue() {
            return this.navHidden_;
        }

        public ConfigurationOuterClass.Configuration.NavHidden getNavHidden() {
            ConfigurationOuterClass.Configuration.NavHidden result = ConfigurationOuterClass.Configuration.NavHidden.valueOf(this.navHidden_);
            return result == null ? ConfigurationOuterClass.Configuration.NavHidden.UNRECOGNIZED : result;
        }

        public int getNavigationValue() {
            return this.navigation_;
        }

        public ConfigurationOuterClass.Configuration.Navigation getNavigation() {
            ConfigurationOuterClass.Configuration.Navigation result = ConfigurationOuterClass.Configuration.Navigation.valueOf(this.navigation_);
            return result == null ? ConfigurationOuterClass.Configuration.Navigation.UNRECOGNIZED : result;
        }

        public int getSdkVersion() {
            return this.sdkVersion_;
        }

        public java.lang.String getProduct() {
            Object ref = this.product_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                java.lang.String s = bs.toStringUtf8();
                this.product_ = s;
                return s;
            }
        }

        public ByteString getProductBytes() {
            Object ref = this.product_;
            if (ref instanceof java.lang.String) {
                ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                this.product_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            } else if (isInitialized == 0) {
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        @Override
        public void writeTo(CodedOutputStream output) throws IOException {
            if (this.mcc_ != 0) {
                output.writeUInt32(1, this.mcc_);
            }

            if (this.mnc_ != 0) {
                output.writeUInt32(2, this.mnc_);
            }

            if (!this.getLocaleBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 3, this.locale_);
            }

            if (this.layoutDirection_ != ConfigurationOuterClass.Configuration.LayoutDirection.LAYOUT_DIRECTION_UNSET.getNumber()) {
                output.writeEnum(4, this.layoutDirection_);
            }

            if (this.screenWidth_ != 0) {
                output.writeUInt32(5, this.screenWidth_);
            }

            if (this.screenHeight_ != 0) {
                output.writeUInt32(6, this.screenHeight_);
            }

            if (this.screenWidthDp_ != 0) {
                output.writeUInt32(7, this.screenWidthDp_);
            }

            if (this.screenHeightDp_ != 0) {
                output.writeUInt32(8, this.screenHeightDp_);
            }

            if (this.smallestScreenWidthDp_ != 0) {
                output.writeUInt32(9, this.smallestScreenWidthDp_);
            }

            if (this.screenLayoutSize_ != ConfigurationOuterClass.Configuration.ScreenLayoutSize.SCREEN_LAYOUT_SIZE_UNSET.getNumber()) {
                output.writeEnum(10, this.screenLayoutSize_);
            }

            if (this.screenLayoutLong_ != ConfigurationOuterClass.Configuration.ScreenLayoutLong.SCREEN_LAYOUT_LONG_UNSET.getNumber()) {
                output.writeEnum(11, this.screenLayoutLong_);
            }

            if (this.screenRound_ != ConfigurationOuterClass.Configuration.ScreenRound.SCREEN_ROUND_UNSET.getNumber()) {
                output.writeEnum(12, this.screenRound_);
            }

            if (this.wideColorGamut_ != ConfigurationOuterClass.Configuration.WideColorGamut.WIDE_COLOR_GAMUT_UNSET.getNumber()) {
                output.writeEnum(13, this.wideColorGamut_);
            }

            if (this.hdr_ != ConfigurationOuterClass.Configuration.Hdr.HDR_UNSET.getNumber()) {
                output.writeEnum(14, this.hdr_);
            }

            if (this.orientation_ != ConfigurationOuterClass.Configuration.Orientation.ORIENTATION_UNSET.getNumber()) {
                output.writeEnum(15, this.orientation_);
            }

            if (this.uiModeType_ != ConfigurationOuterClass.Configuration.UiModeType.UI_MODE_TYPE_UNSET.getNumber()) {
                output.writeEnum(16, this.uiModeType_);
            }

            if (this.uiModeNight_ != ConfigurationOuterClass.Configuration.UiModeNight.UI_MODE_NIGHT_UNSET.getNumber()) {
                output.writeEnum(17, this.uiModeNight_);
            }

            if (this.density_ != 0) {
                output.writeUInt32(18, this.density_);
            }

            if (this.touchscreen_ != ConfigurationOuterClass.Configuration.Touchscreen.TOUCHSCREEN_UNSET.getNumber()) {
                output.writeEnum(19, this.touchscreen_);
            }

            if (this.keysHidden_ != ConfigurationOuterClass.Configuration.KeysHidden.KEYS_HIDDEN_UNSET.getNumber()) {
                output.writeEnum(20, this.keysHidden_);
            }

            if (this.keyboard_ != ConfigurationOuterClass.Configuration.Keyboard.KEYBOARD_UNSET.getNumber()) {
                output.writeEnum(21, this.keyboard_);
            }

            if (this.navHidden_ != ConfigurationOuterClass.Configuration.NavHidden.NAV_HIDDEN_UNSET.getNumber()) {
                output.writeEnum(22, this.navHidden_);
            }

            if (this.navigation_ != ConfigurationOuterClass.Configuration.Navigation.NAVIGATION_UNSET.getNumber()) {
                output.writeEnum(23, this.navigation_);
            }

            if (this.sdkVersion_ != 0) {
                output.writeUInt32(24, this.sdkVersion_);
            }

            if (!this.getProductBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 25, this.product_);
            }

            this.unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            } else {
                size = 0;
                if (this.mcc_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(1, this.mcc_);
                }

                if (this.mnc_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(2, this.mnc_);
                }

                if (!this.getLocaleBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(3, this.locale_);
                }

                if (this.layoutDirection_ != ConfigurationOuterClass.Configuration.LayoutDirection.LAYOUT_DIRECTION_UNSET.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(4, this.layoutDirection_);
                }

                if (this.screenWidth_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(5, this.screenWidth_);
                }

                if (this.screenHeight_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(6, this.screenHeight_);
                }

                if (this.screenWidthDp_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(7, this.screenWidthDp_);
                }

                if (this.screenHeightDp_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(8, this.screenHeightDp_);
                }

                if (this.smallestScreenWidthDp_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(9, this.smallestScreenWidthDp_);
                }

                if (this.screenLayoutSize_ != ConfigurationOuterClass.Configuration.ScreenLayoutSize.SCREEN_LAYOUT_SIZE_UNSET.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(10, this.screenLayoutSize_);
                }

                if (this.screenLayoutLong_ != ConfigurationOuterClass.Configuration.ScreenLayoutLong.SCREEN_LAYOUT_LONG_UNSET.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(11, this.screenLayoutLong_);
                }

                if (this.screenRound_ != ConfigurationOuterClass.Configuration.ScreenRound.SCREEN_ROUND_UNSET.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(12, this.screenRound_);
                }

                if (this.wideColorGamut_ != ConfigurationOuterClass.Configuration.WideColorGamut.WIDE_COLOR_GAMUT_UNSET.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(13, this.wideColorGamut_);
                }

                if (this.hdr_ != ConfigurationOuterClass.Configuration.Hdr.HDR_UNSET.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(14, this.hdr_);
                }

                if (this.orientation_ != ConfigurationOuterClass.Configuration.Orientation.ORIENTATION_UNSET.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(15, this.orientation_);
                }

                if (this.uiModeType_ != ConfigurationOuterClass.Configuration.UiModeType.UI_MODE_TYPE_UNSET.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(16, this.uiModeType_);
                }

                if (this.uiModeNight_ != ConfigurationOuterClass.Configuration.UiModeNight.UI_MODE_NIGHT_UNSET.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(17, this.uiModeNight_);
                }

                if (this.density_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(18, this.density_);
                }

                if (this.touchscreen_ != ConfigurationOuterClass.Configuration.Touchscreen.TOUCHSCREEN_UNSET.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(19, this.touchscreen_);
                }

                if (this.keysHidden_ != ConfigurationOuterClass.Configuration.KeysHidden.KEYS_HIDDEN_UNSET.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(20, this.keysHidden_);
                }

                if (this.keyboard_ != ConfigurationOuterClass.Configuration.Keyboard.KEYBOARD_UNSET.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(21, this.keyboard_);
                }

                if (this.navHidden_ != ConfigurationOuterClass.Configuration.NavHidden.NAV_HIDDEN_UNSET.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(22, this.navHidden_);
                }

                if (this.navigation_ != ConfigurationOuterClass.Configuration.Navigation.NAVIGATION_UNSET.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(23, this.navigation_);
                }

                if (this.sdkVersion_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(24, this.sdkVersion_);
                }

                if (!this.getProductBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(25, this.product_);
                }

                size += this.unknownFields.getSerializedSize();
                this.memoizedSize = size;
                return size;
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            } else if (!(obj instanceof ConfigurationOuterClass.Configuration)) {
                return super.equals(obj);
            } else {
                ConfigurationOuterClass.Configuration other = (ConfigurationOuterClass.Configuration)obj;
                if (this.getMcc() != other.getMcc()) {
                    return false;
                } else if (this.getMnc() != other.getMnc()) {
                    return false;
                } else if (!this.getLocale().equals(other.getLocale())) {
                    return false;
                } else if (this.layoutDirection_ != other.layoutDirection_) {
                    return false;
                } else if (this.getScreenWidth() != other.getScreenWidth()) {
                    return false;
                } else if (this.getScreenHeight() != other.getScreenHeight()) {
                    return false;
                } else if (this.getScreenWidthDp() != other.getScreenWidthDp()) {
                    return false;
                } else if (this.getScreenHeightDp() != other.getScreenHeightDp()) {
                    return false;
                } else if (this.getSmallestScreenWidthDp() != other.getSmallestScreenWidthDp()) {
                    return false;
                } else if (this.screenLayoutSize_ != other.screenLayoutSize_) {
                    return false;
                } else if (this.screenLayoutLong_ != other.screenLayoutLong_) {
                    return false;
                } else if (this.screenRound_ != other.screenRound_) {
                    return false;
                } else if (this.wideColorGamut_ != other.wideColorGamut_) {
                    return false;
                } else if (this.hdr_ != other.hdr_) {
                    return false;
                } else if (this.orientation_ != other.orientation_) {
                    return false;
                } else if (this.uiModeType_ != other.uiModeType_) {
                    return false;
                } else if (this.uiModeNight_ != other.uiModeNight_) {
                    return false;
                } else if (this.getDensity() != other.getDensity()) {
                    return false;
                } else if (this.touchscreen_ != other.touchscreen_) {
                    return false;
                } else if (this.keysHidden_ != other.keysHidden_) {
                    return false;
                } else if (this.keyboard_ != other.keyboard_) {
                    return false;
                } else if (this.navHidden_ != other.navHidden_) {
                    return false;
                } else if (this.navigation_ != other.navigation_) {
                    return false;
                } else if (this.getSdkVersion() != other.getSdkVersion()) {
                    return false;
                } else if (!this.getProduct().equals(other.getProduct())) {
                    return false;
                } else {
                    return this.unknownFields.equals(other.unknownFields);
                }
            }
        }

        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            } else {
                int hash = 41;
                hash = 19 * hash + getDescriptor().hashCode();
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getMcc();
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getMnc();
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getLocale().hashCode();
                hash = 37 * hash + 4;
                hash = 53 * hash + this.layoutDirection_;
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getScreenWidth();
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getScreenHeight();
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getScreenWidthDp();
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getScreenHeightDp();
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getSmallestScreenWidthDp();
                hash = 37 * hash + 10;
                hash = 53 * hash + this.screenLayoutSize_;
                hash = 37 * hash + 11;
                hash = 53 * hash + this.screenLayoutLong_;
                hash = 37 * hash + 12;
                hash = 53 * hash + this.screenRound_;
                hash = 37 * hash + 13;
                hash = 53 * hash + this.wideColorGamut_;
                hash = 37 * hash + 14;
                hash = 53 * hash + this.hdr_;
                hash = 37 * hash + 15;
                hash = 53 * hash + this.orientation_;
                hash = 37 * hash + 16;
                hash = 53 * hash + this.uiModeType_;
                hash = 37 * hash + 17;
                hash = 53 * hash + this.uiModeNight_;
                hash = 37 * hash + 18;
                hash = 53 * hash + this.getDensity();
                hash = 37 * hash + 19;
                hash = 53 * hash + this.touchscreen_;
                hash = 37 * hash + 20;
                hash = 53 * hash + this.keysHidden_;
                hash = 37 * hash + 21;
                hash = 53 * hash + this.keyboard_;
                hash = 37 * hash + 22;
                hash = 53 * hash + this.navHidden_;
                hash = 37 * hash + 23;
                hash = 53 * hash + this.navigation_;
                hash = 37 * hash + 24;
                hash = 53 * hash + this.getSdkVersion();
                hash = 37 * hash + 25;
                hash = 53 * hash + this.getProduct().hashCode();
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static ConfigurationOuterClass.Configuration parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (ConfigurationOuterClass.Configuration)PARSER.parseFrom(data);
        }

        public static ConfigurationOuterClass.Configuration parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ConfigurationOuterClass.Configuration)PARSER.parseFrom(data, extensionRegistry);
        }

        public static ConfigurationOuterClass.Configuration parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ConfigurationOuterClass.Configuration)PARSER.parseFrom(data);
        }

        public static ConfigurationOuterClass.Configuration parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ConfigurationOuterClass.Configuration)PARSER.parseFrom(data, extensionRegistry);
        }

        public static ConfigurationOuterClass.Configuration parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ConfigurationOuterClass.Configuration)PARSER.parseFrom(data);
        }

        public static ConfigurationOuterClass.Configuration parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ConfigurationOuterClass.Configuration)PARSER.parseFrom(data, extensionRegistry);
        }

        public static ConfigurationOuterClass.Configuration parseFrom(InputStream input) throws IOException {
            return (ConfigurationOuterClass.Configuration)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static ConfigurationOuterClass.Configuration parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ConfigurationOuterClass.Configuration)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static ConfigurationOuterClass.Configuration parseDelimitedFrom(InputStream input) throws IOException {
            return (ConfigurationOuterClass.Configuration)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static ConfigurationOuterClass.Configuration parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ConfigurationOuterClass.Configuration)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static ConfigurationOuterClass.Configuration parseFrom(CodedInputStream input) throws IOException {
            return (ConfigurationOuterClass.Configuration)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static ConfigurationOuterClass.Configuration parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ConfigurationOuterClass.Configuration)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public ConfigurationOuterClass.Configuration.Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigurationOuterClass.Configuration.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigurationOuterClass.Configuration.Builder newBuilder(ConfigurationOuterClass.Configuration prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public ConfigurationOuterClass.Configuration.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new ConfigurationOuterClass.Configuration.Builder() : (new ConfigurationOuterClass.Configuration.Builder()).mergeFrom(this);
        }

        public ConfigurationOuterClass.Configuration.Builder newBuilderForType(BuilderParent parent) {
            ConfigurationOuterClass.Configuration.Builder builder = new ConfigurationOuterClass.Configuration.Builder(parent);
            return builder;
        }

        public static ConfigurationOuterClass.Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ConfigurationOuterClass.Configuration> parser() {
            return PARSER;
        }

        public Parser<ConfigurationOuterClass.Configuration> getParserForType() {
            return PARSER;
        }

        public ConfigurationOuterClass.Configuration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<ConfigurationOuterClass.Configuration.Builder> implements ConfigurationOuterClass.ConfigurationOrBuilder {
            private int mcc_;
            private int mnc_;
            private Object locale_;
            private int layoutDirection_;
            private int screenWidth_;
            private int screenHeight_;
            private int screenWidthDp_;
            private int screenHeightDp_;
            private int smallestScreenWidthDp_;
            private int screenLayoutSize_;
            private int screenLayoutLong_;
            private int screenRound_;
            private int wideColorGamut_;
            private int hdr_;
            private int orientation_;
            private int uiModeType_;
            private int uiModeNight_;
            private int density_;
            private int touchscreen_;
            private int keysHidden_;
            private int keyboard_;
            private int navHidden_;
            private int navigation_;
            private int sdkVersion_;
            private Object product_;

            public static final Descriptor getDescriptor() {
                return ConfigurationOuterClass.internal_static_aapt_pb_Configuration_descriptor;
            }

            public FieldAccessorTable internalGetFieldAccessorTable() {
                return ConfigurationOuterClass.internal_static_aapt_pb_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationOuterClass.Configuration.class, ConfigurationOuterClass.Configuration.Builder.class);
            }

            private Builder() {
                this.locale_ = "";
                this.layoutDirection_ = 0;
                this.screenLayoutSize_ = 0;
                this.screenLayoutLong_ = 0;
                this.screenRound_ = 0;
                this.wideColorGamut_ = 0;
                this.hdr_ = 0;
                this.orientation_ = 0;
                this.uiModeType_ = 0;
                this.uiModeNight_ = 0;
                this.touchscreen_ = 0;
                this.keysHidden_ = 0;
                this.keyboard_ = 0;
                this.navHidden_ = 0;
                this.navigation_ = 0;
                this.product_ = "";
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.locale_ = "";
                this.layoutDirection_ = 0;
                this.screenLayoutSize_ = 0;
                this.screenLayoutLong_ = 0;
                this.screenRound_ = 0;
                this.wideColorGamut_ = 0;
                this.hdr_ = 0;
                this.orientation_ = 0;
                this.uiModeType_ = 0;
                this.uiModeNight_ = 0;
                this.touchscreen_ = 0;
                this.keysHidden_ = 0;
                this.keyboard_ = 0;
                this.navHidden_ = 0;
                this.navigation_ = 0;
                this.product_ = "";
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (ConfigurationOuterClass.Configuration.alwaysUseFieldBuilders) {
                }

            }

            public ConfigurationOuterClass.Configuration.Builder clear() {
                super.clear();
                this.mcc_ = 0;
                this.mnc_ = 0;
                this.locale_ = "";
                this.layoutDirection_ = 0;
                this.screenWidth_ = 0;
                this.screenHeight_ = 0;
                this.screenWidthDp_ = 0;
                this.screenHeightDp_ = 0;
                this.smallestScreenWidthDp_ = 0;
                this.screenLayoutSize_ = 0;
                this.screenLayoutLong_ = 0;
                this.screenRound_ = 0;
                this.wideColorGamut_ = 0;
                this.hdr_ = 0;
                this.orientation_ = 0;
                this.uiModeType_ = 0;
                this.uiModeNight_ = 0;
                this.density_ = 0;
                this.touchscreen_ = 0;
                this.keysHidden_ = 0;
                this.keyboard_ = 0;
                this.navHidden_ = 0;
                this.navigation_ = 0;
                this.sdkVersion_ = 0;
                this.product_ = "";
                return this;
            }

            public Descriptor getDescriptorForType() {
                return ConfigurationOuterClass.internal_static_aapt_pb_Configuration_descriptor;
            }

            public ConfigurationOuterClass.Configuration getDefaultInstanceForType() {
                return ConfigurationOuterClass.Configuration.getDefaultInstance();
            }

            public ConfigurationOuterClass.Configuration build() {
                ConfigurationOuterClass.Configuration result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public ConfigurationOuterClass.Configuration buildPartial() {
                ConfigurationOuterClass.Configuration result = new ConfigurationOuterClass.Configuration(this);
                result.mcc_ = this.mcc_;
                result.mnc_ = this.mnc_;
                result.locale_ = this.locale_;
                result.layoutDirection_ = this.layoutDirection_;
                result.screenWidth_ = this.screenWidth_;
                result.screenHeight_ = this.screenHeight_;
                result.screenWidthDp_ = this.screenWidthDp_;
                result.screenHeightDp_ = this.screenHeightDp_;
                result.smallestScreenWidthDp_ = this.smallestScreenWidthDp_;
                result.screenLayoutSize_ = this.screenLayoutSize_;
                result.screenLayoutLong_ = this.screenLayoutLong_;
                result.screenRound_ = this.screenRound_;
                result.wideColorGamut_ = this.wideColorGamut_;
                result.hdr_ = this.hdr_;
                result.orientation_ = this.orientation_;
                result.uiModeType_ = this.uiModeType_;
                result.uiModeNight_ = this.uiModeNight_;
                result.density_ = this.density_;
                result.touchscreen_ = this.touchscreen_;
                result.keysHidden_ = this.keysHidden_;
                result.keyboard_ = this.keyboard_;
                result.navHidden_ = this.navHidden_;
                result.navigation_ = this.navigation_;
                result.sdkVersion_ = this.sdkVersion_;
                result.product_ = this.product_;
                this.onBuilt();
                return result;
            }

            public ConfigurationOuterClass.Configuration.Builder clone() {
                return (ConfigurationOuterClass.Configuration.Builder)super.clone();
            }

            public ConfigurationOuterClass.Configuration.Builder setField(FieldDescriptor field, Object value) {
                return (ConfigurationOuterClass.Configuration.Builder)super.setField(field, value);
            }

            public ConfigurationOuterClass.Configuration.Builder clearField(FieldDescriptor field) {
                return (ConfigurationOuterClass.Configuration.Builder)super.clearField(field);
            }

            public ConfigurationOuterClass.Configuration.Builder clearOneof(OneofDescriptor oneof) {
                return (ConfigurationOuterClass.Configuration.Builder)super.clearOneof(oneof);
            }

            public ConfigurationOuterClass.Configuration.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
                return (ConfigurationOuterClass.Configuration.Builder)super.setRepeatedField(field, index, value);
            }

            public ConfigurationOuterClass.Configuration.Builder addRepeatedField(FieldDescriptor field, Object value) {
                return (ConfigurationOuterClass.Configuration.Builder)super.addRepeatedField(field, value);
            }

            public ConfigurationOuterClass.Configuration.Builder mergeFrom(Message other) {
                if (other instanceof ConfigurationOuterClass.Configuration) {
                    return this.mergeFrom((ConfigurationOuterClass.Configuration)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder mergeFrom(ConfigurationOuterClass.Configuration other) {
                if (other == ConfigurationOuterClass.Configuration.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.getMcc() != 0) {
                        this.setMcc(other.getMcc());
                    }

                    if (other.getMnc() != 0) {
                        this.setMnc(other.getMnc());
                    }

                    if (!other.getLocale().isEmpty()) {
                        this.locale_ = other.locale_;
                        this.onChanged();
                    }

                    if (other.layoutDirection_ != 0) {
                        this.setLayoutDirectionValue(other.getLayoutDirectionValue());
                    }

                    if (other.getScreenWidth() != 0) {
                        this.setScreenWidth(other.getScreenWidth());
                    }

                    if (other.getScreenHeight() != 0) {
                        this.setScreenHeight(other.getScreenHeight());
                    }

                    if (other.getScreenWidthDp() != 0) {
                        this.setScreenWidthDp(other.getScreenWidthDp());
                    }

                    if (other.getScreenHeightDp() != 0) {
                        this.setScreenHeightDp(other.getScreenHeightDp());
                    }

                    if (other.getSmallestScreenWidthDp() != 0) {
                        this.setSmallestScreenWidthDp(other.getSmallestScreenWidthDp());
                    }

                    if (other.screenLayoutSize_ != 0) {
                        this.setScreenLayoutSizeValue(other.getScreenLayoutSizeValue());
                    }

                    if (other.screenLayoutLong_ != 0) {
                        this.setScreenLayoutLongValue(other.getScreenLayoutLongValue());
                    }

                    if (other.screenRound_ != 0) {
                        this.setScreenRoundValue(other.getScreenRoundValue());
                    }

                    if (other.wideColorGamut_ != 0) {
                        this.setWideColorGamutValue(other.getWideColorGamutValue());
                    }

                    if (other.hdr_ != 0) {
                        this.setHdrValue(other.getHdrValue());
                    }

                    if (other.orientation_ != 0) {
                        this.setOrientationValue(other.getOrientationValue());
                    }

                    if (other.uiModeType_ != 0) {
                        this.setUiModeTypeValue(other.getUiModeTypeValue());
                    }

                    if (other.uiModeNight_ != 0) {
                        this.setUiModeNightValue(other.getUiModeNightValue());
                    }

                    if (other.getDensity() != 0) {
                        this.setDensity(other.getDensity());
                    }

                    if (other.touchscreen_ != 0) {
                        this.setTouchscreenValue(other.getTouchscreenValue());
                    }

                    if (other.keysHidden_ != 0) {
                        this.setKeysHiddenValue(other.getKeysHiddenValue());
                    }

                    if (other.keyboard_ != 0) {
                        this.setKeyboardValue(other.getKeyboardValue());
                    }

                    if (other.navHidden_ != 0) {
                        this.setNavHiddenValue(other.getNavHiddenValue());
                    }

                    if (other.navigation_ != 0) {
                        this.setNavigationValue(other.getNavigationValue());
                    }

                    if (other.getSdkVersion() != 0) {
                        this.setSdkVersion(other.getSdkVersion());
                    }

                    if (!other.getProduct().isEmpty()) {
                        this.product_ = other.product_;
                        this.onChanged();
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public ConfigurationOuterClass.Configuration.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ConfigurationOuterClass.Configuration parsedMessage = null;

                try {
                    parsedMessage = (ConfigurationOuterClass.Configuration)ConfigurationOuterClass.Configuration.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (ConfigurationOuterClass.Configuration)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public int getMcc() {
                return this.mcc_;
            }

            public ConfigurationOuterClass.Configuration.Builder setMcc(int value) {
                this.mcc_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.Builder clearMcc() {
                this.mcc_ = 0;
                this.onChanged();
                return this;
            }

            public int getMnc() {
                return this.mnc_;
            }

            public ConfigurationOuterClass.Configuration.Builder setMnc(int value) {
                this.mnc_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.Builder clearMnc() {
                this.mnc_ = 0;
                this.onChanged();
                return this;
            }

            public java.lang.String getLocale() {
                Object ref = this.locale_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.locale_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getLocaleBytes() {
                Object ref = this.locale_;
                if (ref instanceof java.lang.String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.locale_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder setLocale(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.locale_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder clearLocale() {
                this.locale_ = ConfigurationOuterClass.Configuration.getDefaultInstance().getLocale();
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.Builder setLocaleBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    ConfigurationOuterClass.Configuration.checkByteStringIsUtf8(value);
                    this.locale_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public int getLayoutDirectionValue() {
                return this.layoutDirection_;
            }

            public ConfigurationOuterClass.Configuration.Builder setLayoutDirectionValue(int value) {
                this.layoutDirection_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.LayoutDirection getLayoutDirection() {
                ConfigurationOuterClass.Configuration.LayoutDirection result = ConfigurationOuterClass.Configuration.LayoutDirection.valueOf(this.layoutDirection_);
                return result == null ? ConfigurationOuterClass.Configuration.LayoutDirection.UNRECOGNIZED : result;
            }

            public ConfigurationOuterClass.Configuration.Builder setLayoutDirection(ConfigurationOuterClass.Configuration.LayoutDirection value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.layoutDirection_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder clearLayoutDirection() {
                this.layoutDirection_ = 0;
                this.onChanged();
                return this;
            }

            public int getScreenWidth() {
                return this.screenWidth_;
            }

            public ConfigurationOuterClass.Configuration.Builder setScreenWidth(int value) {
                this.screenWidth_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.Builder clearScreenWidth() {
                this.screenWidth_ = 0;
                this.onChanged();
                return this;
            }

            public int getScreenHeight() {
                return this.screenHeight_;
            }

            public ConfigurationOuterClass.Configuration.Builder setScreenHeight(int value) {
                this.screenHeight_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.Builder clearScreenHeight() {
                this.screenHeight_ = 0;
                this.onChanged();
                return this;
            }

            public int getScreenWidthDp() {
                return this.screenWidthDp_;
            }

            public ConfigurationOuterClass.Configuration.Builder setScreenWidthDp(int value) {
                this.screenWidthDp_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.Builder clearScreenWidthDp() {
                this.screenWidthDp_ = 0;
                this.onChanged();
                return this;
            }

            public int getScreenHeightDp() {
                return this.screenHeightDp_;
            }

            public ConfigurationOuterClass.Configuration.Builder setScreenHeightDp(int value) {
                this.screenHeightDp_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.Builder clearScreenHeightDp() {
                this.screenHeightDp_ = 0;
                this.onChanged();
                return this;
            }

            public int getSmallestScreenWidthDp() {
                return this.smallestScreenWidthDp_;
            }

            public ConfigurationOuterClass.Configuration.Builder setSmallestScreenWidthDp(int value) {
                this.smallestScreenWidthDp_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.Builder clearSmallestScreenWidthDp() {
                this.smallestScreenWidthDp_ = 0;
                this.onChanged();
                return this;
            }

            public int getScreenLayoutSizeValue() {
                return this.screenLayoutSize_;
            }

            public ConfigurationOuterClass.Configuration.Builder setScreenLayoutSizeValue(int value) {
                this.screenLayoutSize_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.ScreenLayoutSize getScreenLayoutSize() {
                ConfigurationOuterClass.Configuration.ScreenLayoutSize result = ConfigurationOuterClass.Configuration.ScreenLayoutSize.valueOf(this.screenLayoutSize_);
                return result == null ? ConfigurationOuterClass.Configuration.ScreenLayoutSize.UNRECOGNIZED : result;
            }

            public ConfigurationOuterClass.Configuration.Builder setScreenLayoutSize(ConfigurationOuterClass.Configuration.ScreenLayoutSize value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.screenLayoutSize_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder clearScreenLayoutSize() {
                this.screenLayoutSize_ = 0;
                this.onChanged();
                return this;
            }

            public int getScreenLayoutLongValue() {
                return this.screenLayoutLong_;
            }

            public ConfigurationOuterClass.Configuration.Builder setScreenLayoutLongValue(int value) {
                this.screenLayoutLong_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.ScreenLayoutLong getScreenLayoutLong() {
                ConfigurationOuterClass.Configuration.ScreenLayoutLong result = ConfigurationOuterClass.Configuration.ScreenLayoutLong.valueOf(this.screenLayoutLong_);
                return result == null ? ConfigurationOuterClass.Configuration.ScreenLayoutLong.UNRECOGNIZED : result;
            }

            public ConfigurationOuterClass.Configuration.Builder setScreenLayoutLong(ConfigurationOuterClass.Configuration.ScreenLayoutLong value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.screenLayoutLong_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder clearScreenLayoutLong() {
                this.screenLayoutLong_ = 0;
                this.onChanged();
                return this;
            }

            public int getScreenRoundValue() {
                return this.screenRound_;
            }

            public ConfigurationOuterClass.Configuration.Builder setScreenRoundValue(int value) {
                this.screenRound_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.ScreenRound getScreenRound() {
                ConfigurationOuterClass.Configuration.ScreenRound result = ConfigurationOuterClass.Configuration.ScreenRound.valueOf(this.screenRound_);
                return result == null ? ConfigurationOuterClass.Configuration.ScreenRound.UNRECOGNIZED : result;
            }

            public ConfigurationOuterClass.Configuration.Builder setScreenRound(ConfigurationOuterClass.Configuration.ScreenRound value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.screenRound_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder clearScreenRound() {
                this.screenRound_ = 0;
                this.onChanged();
                return this;
            }

            public int getWideColorGamutValue() {
                return this.wideColorGamut_;
            }

            public ConfigurationOuterClass.Configuration.Builder setWideColorGamutValue(int value) {
                this.wideColorGamut_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.WideColorGamut getWideColorGamut() {
                ConfigurationOuterClass.Configuration.WideColorGamut result = ConfigurationOuterClass.Configuration.WideColorGamut.valueOf(this.wideColorGamut_);
                return result == null ? ConfigurationOuterClass.Configuration.WideColorGamut.UNRECOGNIZED : result;
            }

            public ConfigurationOuterClass.Configuration.Builder setWideColorGamut(ConfigurationOuterClass.Configuration.WideColorGamut value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.wideColorGamut_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder clearWideColorGamut() {
                this.wideColorGamut_ = 0;
                this.onChanged();
                return this;
            }

            public int getHdrValue() {
                return this.hdr_;
            }

            public ConfigurationOuterClass.Configuration.Builder setHdrValue(int value) {
                this.hdr_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.Hdr getHdr() {
                ConfigurationOuterClass.Configuration.Hdr result = ConfigurationOuterClass.Configuration.Hdr.valueOf(this.hdr_);
                return result == null ? ConfigurationOuterClass.Configuration.Hdr.UNRECOGNIZED : result;
            }

            public ConfigurationOuterClass.Configuration.Builder setHdr(ConfigurationOuterClass.Configuration.Hdr value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.hdr_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder clearHdr() {
                this.hdr_ = 0;
                this.onChanged();
                return this;
            }

            public int getOrientationValue() {
                return this.orientation_;
            }

            public ConfigurationOuterClass.Configuration.Builder setOrientationValue(int value) {
                this.orientation_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.Orientation getOrientation() {
                ConfigurationOuterClass.Configuration.Orientation result = ConfigurationOuterClass.Configuration.Orientation.valueOf(this.orientation_);
                return result == null ? ConfigurationOuterClass.Configuration.Orientation.UNRECOGNIZED : result;
            }

            public ConfigurationOuterClass.Configuration.Builder setOrientation(ConfigurationOuterClass.Configuration.Orientation value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.orientation_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder clearOrientation() {
                this.orientation_ = 0;
                this.onChanged();
                return this;
            }

            public int getUiModeTypeValue() {
                return this.uiModeType_;
            }

            public ConfigurationOuterClass.Configuration.Builder setUiModeTypeValue(int value) {
                this.uiModeType_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.UiModeType getUiModeType() {
                ConfigurationOuterClass.Configuration.UiModeType result = ConfigurationOuterClass.Configuration.UiModeType.valueOf(this.uiModeType_);
                return result == null ? ConfigurationOuterClass.Configuration.UiModeType.UNRECOGNIZED : result;
            }

            public ConfigurationOuterClass.Configuration.Builder setUiModeType(ConfigurationOuterClass.Configuration.UiModeType value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.uiModeType_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder clearUiModeType() {
                this.uiModeType_ = 0;
                this.onChanged();
                return this;
            }

            public int getUiModeNightValue() {
                return this.uiModeNight_;
            }

            public ConfigurationOuterClass.Configuration.Builder setUiModeNightValue(int value) {
                this.uiModeNight_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.UiModeNight getUiModeNight() {
                ConfigurationOuterClass.Configuration.UiModeNight result = ConfigurationOuterClass.Configuration.UiModeNight.valueOf(this.uiModeNight_);
                return result == null ? ConfigurationOuterClass.Configuration.UiModeNight.UNRECOGNIZED : result;
            }

            public ConfigurationOuterClass.Configuration.Builder setUiModeNight(ConfigurationOuterClass.Configuration.UiModeNight value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.uiModeNight_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder clearUiModeNight() {
                this.uiModeNight_ = 0;
                this.onChanged();
                return this;
            }

            public int getDensity() {
                return this.density_;
            }

            public ConfigurationOuterClass.Configuration.Builder setDensity(int value) {
                this.density_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.Builder clearDensity() {
                this.density_ = 0;
                this.onChanged();
                return this;
            }

            public int getTouchscreenValue() {
                return this.touchscreen_;
            }

            public ConfigurationOuterClass.Configuration.Builder setTouchscreenValue(int value) {
                this.touchscreen_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.Touchscreen getTouchscreen() {
                ConfigurationOuterClass.Configuration.Touchscreen result = ConfigurationOuterClass.Configuration.Touchscreen.valueOf(this.touchscreen_);
                return result == null ? ConfigurationOuterClass.Configuration.Touchscreen.UNRECOGNIZED : result;
            }

            public ConfigurationOuterClass.Configuration.Builder setTouchscreen(ConfigurationOuterClass.Configuration.Touchscreen value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.touchscreen_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder clearTouchscreen() {
                this.touchscreen_ = 0;
                this.onChanged();
                return this;
            }

            public int getKeysHiddenValue() {
                return this.keysHidden_;
            }

            public ConfigurationOuterClass.Configuration.Builder setKeysHiddenValue(int value) {
                this.keysHidden_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.KeysHidden getKeysHidden() {
                ConfigurationOuterClass.Configuration.KeysHidden result = ConfigurationOuterClass.Configuration.KeysHidden.valueOf(this.keysHidden_);
                return result == null ? ConfigurationOuterClass.Configuration.KeysHidden.UNRECOGNIZED : result;
            }

            public ConfigurationOuterClass.Configuration.Builder setKeysHidden(ConfigurationOuterClass.Configuration.KeysHidden value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.keysHidden_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder clearKeysHidden() {
                this.keysHidden_ = 0;
                this.onChanged();
                return this;
            }

            public int getKeyboardValue() {
                return this.keyboard_;
            }

            public ConfigurationOuterClass.Configuration.Builder setKeyboardValue(int value) {
                this.keyboard_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.Keyboard getKeyboard() {
                ConfigurationOuterClass.Configuration.Keyboard result = ConfigurationOuterClass.Configuration.Keyboard.valueOf(this.keyboard_);
                return result == null ? ConfigurationOuterClass.Configuration.Keyboard.UNRECOGNIZED : result;
            }

            public ConfigurationOuterClass.Configuration.Builder setKeyboard(ConfigurationOuterClass.Configuration.Keyboard value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.keyboard_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder clearKeyboard() {
                this.keyboard_ = 0;
                this.onChanged();
                return this;
            }

            public int getNavHiddenValue() {
                return this.navHidden_;
            }

            public ConfigurationOuterClass.Configuration.Builder setNavHiddenValue(int value) {
                this.navHidden_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.NavHidden getNavHidden() {
                ConfigurationOuterClass.Configuration.NavHidden result = ConfigurationOuterClass.Configuration.NavHidden.valueOf(this.navHidden_);
                return result == null ? ConfigurationOuterClass.Configuration.NavHidden.UNRECOGNIZED : result;
            }

            public ConfigurationOuterClass.Configuration.Builder setNavHidden(ConfigurationOuterClass.Configuration.NavHidden value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.navHidden_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder clearNavHidden() {
                this.navHidden_ = 0;
                this.onChanged();
                return this;
            }

            public int getNavigationValue() {
                return this.navigation_;
            }

            public ConfigurationOuterClass.Configuration.Builder setNavigationValue(int value) {
                this.navigation_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.Navigation getNavigation() {
                ConfigurationOuterClass.Configuration.Navigation result = ConfigurationOuterClass.Configuration.Navigation.valueOf(this.navigation_);
                return result == null ? ConfigurationOuterClass.Configuration.Navigation.UNRECOGNIZED : result;
            }

            public ConfigurationOuterClass.Configuration.Builder setNavigation(ConfigurationOuterClass.Configuration.Navigation value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.navigation_ = value.getNumber();
                    this.onChanged();
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder clearNavigation() {
                this.navigation_ = 0;
                this.onChanged();
                return this;
            }

            public int getSdkVersion() {
                return this.sdkVersion_;
            }

            public ConfigurationOuterClass.Configuration.Builder setSdkVersion(int value) {
                this.sdkVersion_ = value;
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.Builder clearSdkVersion() {
                this.sdkVersion_ = 0;
                this.onChanged();
                return this;
            }

            public java.lang.String getProduct() {
                Object ref = this.product_;
                if (!(ref instanceof java.lang.String)) {
                    ByteString bs = (ByteString)ref;
                    java.lang.String s = bs.toStringUtf8();
                    this.product_ = s;
                    return s;
                } else {
                    return (java.lang.String)ref;
                }
            }

            public ByteString getProductBytes() {
                Object ref = this.product_;
                if (ref instanceof java.lang.String) {
                    ByteString b = ByteString.copyFromUtf8((java.lang.String)ref);
                    this.product_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder setProduct(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.product_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public ConfigurationOuterClass.Configuration.Builder clearProduct() {
                this.product_ = ConfigurationOuterClass.Configuration.getDefaultInstance().getProduct();
                this.onChanged();
                return this;
            }

            public ConfigurationOuterClass.Configuration.Builder setProductBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    ConfigurationOuterClass.Configuration.checkByteStringIsUtf8(value);
                    this.product_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public final ConfigurationOuterClass.Configuration.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (ConfigurationOuterClass.Configuration.Builder)super.setUnknownFields(unknownFields);
            }

            public final ConfigurationOuterClass.Configuration.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (ConfigurationOuterClass.Configuration.Builder)super.mergeUnknownFields(unknownFields);
            }
        }

        public static enum Navigation implements ProtocolMessageEnum {
            NAVIGATION_UNSET(0),
            NAVIGATION_NONAV(1),
            NAVIGATION_DPAD(2),
            NAVIGATION_TRACKBALL(3),
            NAVIGATION_WHEEL(4),
            UNRECOGNIZED(-1);

            public static final int NAVIGATION_UNSET_VALUE = 0;
            public static final int NAVIGATION_NONAV_VALUE = 1;
            public static final int NAVIGATION_DPAD_VALUE = 2;
            public static final int NAVIGATION_TRACKBALL_VALUE = 3;
            public static final int NAVIGATION_WHEEL_VALUE = 4;
            private static final EnumLiteMap<ConfigurationOuterClass.Configuration.Navigation> internalValueMap = new EnumLiteMap<ConfigurationOuterClass.Configuration.Navigation>() {
                public ConfigurationOuterClass.Configuration.Navigation findValueByNumber(int number) {
                    return ConfigurationOuterClass.Configuration.Navigation.forNumber(number);
                }
            };
            private static final ConfigurationOuterClass.Configuration.Navigation[] VALUES = values();
            private final int value;

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } else {
                    return this.value;
                }
            }

            /** @deprecated */
            @Deprecated
            public static ConfigurationOuterClass.Configuration.Navigation valueOf(int value) {
                return forNumber(value);
            }

            public static ConfigurationOuterClass.Configuration.Navigation forNumber(int value) {
                switch(value) {
                    case 0:
                        return NAVIGATION_UNSET;
                    case 1:
                        return NAVIGATION_NONAV;
                    case 2:
                        return NAVIGATION_DPAD;
                    case 3:
                        return NAVIGATION_TRACKBALL;
                    case 4:
                        return NAVIGATION_WHEEL;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<ConfigurationOuterClass.Configuration.Navigation> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor)ConfigurationOuterClass.Configuration.getDescriptor().getEnumTypes().get(13);
            }

            public static ConfigurationOuterClass.Configuration.Navigation valueOf(EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private Navigation(int value) {
                this.value = value;
            }
        }

        public static enum NavHidden implements ProtocolMessageEnum {
            NAV_HIDDEN_UNSET(0),
            NAV_HIDDEN_NAVEXPOSED(1),
            NAV_HIDDEN_NAVHIDDEN(2),
            UNRECOGNIZED(-1);

            public static final int NAV_HIDDEN_UNSET_VALUE = 0;
            public static final int NAV_HIDDEN_NAVEXPOSED_VALUE = 1;
            public static final int NAV_HIDDEN_NAVHIDDEN_VALUE = 2;
            private static final EnumLiteMap<ConfigurationOuterClass.Configuration.NavHidden> internalValueMap = new EnumLiteMap<ConfigurationOuterClass.Configuration.NavHidden>() {
                public ConfigurationOuterClass.Configuration.NavHidden findValueByNumber(int number) {
                    return ConfigurationOuterClass.Configuration.NavHidden.forNumber(number);
                }
            };
            private static final ConfigurationOuterClass.Configuration.NavHidden[] VALUES = values();
            private final int value;

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } else {
                    return this.value;
                }
            }

            /** @deprecated */
            @Deprecated
            public static ConfigurationOuterClass.Configuration.NavHidden valueOf(int value) {
                return forNumber(value);
            }

            public static ConfigurationOuterClass.Configuration.NavHidden forNumber(int value) {
                switch(value) {
                    case 0:
                        return NAV_HIDDEN_UNSET;
                    case 1:
                        return NAV_HIDDEN_NAVEXPOSED;
                    case 2:
                        return NAV_HIDDEN_NAVHIDDEN;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<ConfigurationOuterClass.Configuration.NavHidden> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor)ConfigurationOuterClass.Configuration.getDescriptor().getEnumTypes().get(12);
            }

            public static ConfigurationOuterClass.Configuration.NavHidden valueOf(EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private NavHidden(int value) {
                this.value = value;
            }
        }

        public static enum Keyboard implements ProtocolMessageEnum {
            KEYBOARD_UNSET(0),
            KEYBOARD_NOKEYS(1),
            KEYBOARD_QWERTY(2),
            KEYBOARD_TWELVEKEY(3),
            UNRECOGNIZED(-1);

            public static final int KEYBOARD_UNSET_VALUE = 0;
            public static final int KEYBOARD_NOKEYS_VALUE = 1;
            public static final int KEYBOARD_QWERTY_VALUE = 2;
            public static final int KEYBOARD_TWELVEKEY_VALUE = 3;
            private static final EnumLiteMap<ConfigurationOuterClass.Configuration.Keyboard> internalValueMap = new EnumLiteMap<ConfigurationOuterClass.Configuration.Keyboard>() {
                public ConfigurationOuterClass.Configuration.Keyboard findValueByNumber(int number) {
                    return ConfigurationOuterClass.Configuration.Keyboard.forNumber(number);
                }
            };
            private static final ConfigurationOuterClass.Configuration.Keyboard[] VALUES = values();
            private final int value;

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } else {
                    return this.value;
                }
            }

            /** @deprecated */
            @Deprecated
            public static ConfigurationOuterClass.Configuration.Keyboard valueOf(int value) {
                return forNumber(value);
            }

            public static ConfigurationOuterClass.Configuration.Keyboard forNumber(int value) {
                switch(value) {
                    case 0:
                        return KEYBOARD_UNSET;
                    case 1:
                        return KEYBOARD_NOKEYS;
                    case 2:
                        return KEYBOARD_QWERTY;
                    case 3:
                        return KEYBOARD_TWELVEKEY;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<ConfigurationOuterClass.Configuration.Keyboard> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor)ConfigurationOuterClass.Configuration.getDescriptor().getEnumTypes().get(11);
            }

            public static ConfigurationOuterClass.Configuration.Keyboard valueOf(EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private Keyboard(int value) {
                this.value = value;
            }
        }

        public static enum KeysHidden implements ProtocolMessageEnum {
            KEYS_HIDDEN_UNSET(0),
            KEYS_HIDDEN_KEYSEXPOSED(1),
            KEYS_HIDDEN_KEYSHIDDEN(2),
            KEYS_HIDDEN_KEYSSOFT(3),
            UNRECOGNIZED(-1);

            public static final int KEYS_HIDDEN_UNSET_VALUE = 0;
            public static final int KEYS_HIDDEN_KEYSEXPOSED_VALUE = 1;
            public static final int KEYS_HIDDEN_KEYSHIDDEN_VALUE = 2;
            public static final int KEYS_HIDDEN_KEYSSOFT_VALUE = 3;
            private static final EnumLiteMap<ConfigurationOuterClass.Configuration.KeysHidden> internalValueMap = new EnumLiteMap<ConfigurationOuterClass.Configuration.KeysHidden>() {
                public ConfigurationOuterClass.Configuration.KeysHidden findValueByNumber(int number) {
                    return ConfigurationOuterClass.Configuration.KeysHidden.forNumber(number);
                }
            };
            private static final ConfigurationOuterClass.Configuration.KeysHidden[] VALUES = values();
            private final int value;

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } else {
                    return this.value;
                }
            }

            /** @deprecated */
            @Deprecated
            public static ConfigurationOuterClass.Configuration.KeysHidden valueOf(int value) {
                return forNumber(value);
            }

            public static ConfigurationOuterClass.Configuration.KeysHidden forNumber(int value) {
                switch(value) {
                    case 0:
                        return KEYS_HIDDEN_UNSET;
                    case 1:
                        return KEYS_HIDDEN_KEYSEXPOSED;
                    case 2:
                        return KEYS_HIDDEN_KEYSHIDDEN;
                    case 3:
                        return KEYS_HIDDEN_KEYSSOFT;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<ConfigurationOuterClass.Configuration.KeysHidden> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor)ConfigurationOuterClass.Configuration.getDescriptor().getEnumTypes().get(10);
            }

            public static ConfigurationOuterClass.Configuration.KeysHidden valueOf(EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private KeysHidden(int value) {
                this.value = value;
            }
        }

        public static enum Touchscreen implements ProtocolMessageEnum {
            TOUCHSCREEN_UNSET(0),
            TOUCHSCREEN_NOTOUCH(1),
            TOUCHSCREEN_STYLUS(2),
            TOUCHSCREEN_FINGER(3),
            UNRECOGNIZED(-1);

            public static final int TOUCHSCREEN_UNSET_VALUE = 0;
            public static final int TOUCHSCREEN_NOTOUCH_VALUE = 1;
            public static final int TOUCHSCREEN_STYLUS_VALUE = 2;
            public static final int TOUCHSCREEN_FINGER_VALUE = 3;
            private static final EnumLiteMap<ConfigurationOuterClass.Configuration.Touchscreen> internalValueMap = new EnumLiteMap<ConfigurationOuterClass.Configuration.Touchscreen>() {
                public ConfigurationOuterClass.Configuration.Touchscreen findValueByNumber(int number) {
                    return ConfigurationOuterClass.Configuration.Touchscreen.forNumber(number);
                }
            };
            private static final ConfigurationOuterClass.Configuration.Touchscreen[] VALUES = values();
            private final int value;

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } else {
                    return this.value;
                }
            }

            /** @deprecated */
            @Deprecated
            public static ConfigurationOuterClass.Configuration.Touchscreen valueOf(int value) {
                return forNumber(value);
            }

            public static ConfigurationOuterClass.Configuration.Touchscreen forNumber(int value) {
                switch(value) {
                    case 0:
                        return TOUCHSCREEN_UNSET;
                    case 1:
                        return TOUCHSCREEN_NOTOUCH;
                    case 2:
                        return TOUCHSCREEN_STYLUS;
                    case 3:
                        return TOUCHSCREEN_FINGER;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<ConfigurationOuterClass.Configuration.Touchscreen> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor)ConfigurationOuterClass.Configuration.getDescriptor().getEnumTypes().get(9);
            }

            public static ConfigurationOuterClass.Configuration.Touchscreen valueOf(EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private Touchscreen(int value) {
                this.value = value;
            }
        }

        public static enum UiModeNight implements ProtocolMessageEnum {
            UI_MODE_NIGHT_UNSET(0),
            UI_MODE_NIGHT_NIGHT(1),
            UI_MODE_NIGHT_NOTNIGHT(2),
            UNRECOGNIZED(-1);

            public static final int UI_MODE_NIGHT_UNSET_VALUE = 0;
            public static final int UI_MODE_NIGHT_NIGHT_VALUE = 1;
            public static final int UI_MODE_NIGHT_NOTNIGHT_VALUE = 2;
            private static final EnumLiteMap<ConfigurationOuterClass.Configuration.UiModeNight> internalValueMap = new EnumLiteMap<ConfigurationOuterClass.Configuration.UiModeNight>() {
                public ConfigurationOuterClass.Configuration.UiModeNight findValueByNumber(int number) {
                    return ConfigurationOuterClass.Configuration.UiModeNight.forNumber(number);
                }
            };
            private static final ConfigurationOuterClass.Configuration.UiModeNight[] VALUES = values();
            private final int value;

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } else {
                    return this.value;
                }
            }

            /** @deprecated */
            @Deprecated
            public static ConfigurationOuterClass.Configuration.UiModeNight valueOf(int value) {
                return forNumber(value);
            }

            public static ConfigurationOuterClass.Configuration.UiModeNight forNumber(int value) {
                switch(value) {
                    case 0:
                        return UI_MODE_NIGHT_UNSET;
                    case 1:
                        return UI_MODE_NIGHT_NIGHT;
                    case 2:
                        return UI_MODE_NIGHT_NOTNIGHT;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<ConfigurationOuterClass.Configuration.UiModeNight> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor)ConfigurationOuterClass.Configuration.getDescriptor().getEnumTypes().get(8);
            }

            public static ConfigurationOuterClass.Configuration.UiModeNight valueOf(EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private UiModeNight(int value) {
                this.value = value;
            }
        }

        public static enum UiModeType implements ProtocolMessageEnum {
            UI_MODE_TYPE_UNSET(0),
            UI_MODE_TYPE_NORMAL(1),
            UI_MODE_TYPE_DESK(2),
            UI_MODE_TYPE_CAR(3),
            UI_MODE_TYPE_TELEVISION(4),
            UI_MODE_TYPE_APPLIANCE(5),
            UI_MODE_TYPE_WATCH(6),
            UI_MODE_TYPE_VRHEADSET(7),
            UNRECOGNIZED(-1);

            public static final int UI_MODE_TYPE_UNSET_VALUE = 0;
            public static final int UI_MODE_TYPE_NORMAL_VALUE = 1;
            public static final int UI_MODE_TYPE_DESK_VALUE = 2;
            public static final int UI_MODE_TYPE_CAR_VALUE = 3;
            public static final int UI_MODE_TYPE_TELEVISION_VALUE = 4;
            public static final int UI_MODE_TYPE_APPLIANCE_VALUE = 5;
            public static final int UI_MODE_TYPE_WATCH_VALUE = 6;
            public static final int UI_MODE_TYPE_VRHEADSET_VALUE = 7;
            private static final EnumLiteMap<ConfigurationOuterClass.Configuration.UiModeType> internalValueMap = new EnumLiteMap<ConfigurationOuterClass.Configuration.UiModeType>() {
                public ConfigurationOuterClass.Configuration.UiModeType findValueByNumber(int number) {
                    return ConfigurationOuterClass.Configuration.UiModeType.forNumber(number);
                }
            };
            private static final ConfigurationOuterClass.Configuration.UiModeType[] VALUES = values();
            private final int value;

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } else {
                    return this.value;
                }
            }

            /** @deprecated */
            @Deprecated
            public static ConfigurationOuterClass.Configuration.UiModeType valueOf(int value) {
                return forNumber(value);
            }

            public static ConfigurationOuterClass.Configuration.UiModeType forNumber(int value) {
                switch(value) {
                    case 0:
                        return UI_MODE_TYPE_UNSET;
                    case 1:
                        return UI_MODE_TYPE_NORMAL;
                    case 2:
                        return UI_MODE_TYPE_DESK;
                    case 3:
                        return UI_MODE_TYPE_CAR;
                    case 4:
                        return UI_MODE_TYPE_TELEVISION;
                    case 5:
                        return UI_MODE_TYPE_APPLIANCE;
                    case 6:
                        return UI_MODE_TYPE_WATCH;
                    case 7:
                        return UI_MODE_TYPE_VRHEADSET;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<ConfigurationOuterClass.Configuration.UiModeType> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor)ConfigurationOuterClass.Configuration.getDescriptor().getEnumTypes().get(7);
            }

            public static ConfigurationOuterClass.Configuration.UiModeType valueOf(EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private UiModeType(int value) {
                this.value = value;
            }
        }

        public static enum Orientation implements ProtocolMessageEnum {
            ORIENTATION_UNSET(0),
            ORIENTATION_PORT(1),
            ORIENTATION_LAND(2),
            ORIENTATION_SQUARE(3),
            UNRECOGNIZED(-1);

            public static final int ORIENTATION_UNSET_VALUE = 0;
            public static final int ORIENTATION_PORT_VALUE = 1;
            public static final int ORIENTATION_LAND_VALUE = 2;
            public static final int ORIENTATION_SQUARE_VALUE = 3;
            private static final EnumLiteMap<ConfigurationOuterClass.Configuration.Orientation> internalValueMap = new EnumLiteMap<ConfigurationOuterClass.Configuration.Orientation>() {
                public ConfigurationOuterClass.Configuration.Orientation findValueByNumber(int number) {
                    return ConfigurationOuterClass.Configuration.Orientation.forNumber(number);
                }
            };
            private static final ConfigurationOuterClass.Configuration.Orientation[] VALUES = values();
            private final int value;

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } else {
                    return this.value;
                }
            }

            /** @deprecated */
            @Deprecated
            public static ConfigurationOuterClass.Configuration.Orientation valueOf(int value) {
                return forNumber(value);
            }

            public static ConfigurationOuterClass.Configuration.Orientation forNumber(int value) {
                switch(value) {
                    case 0:
                        return ORIENTATION_UNSET;
                    case 1:
                        return ORIENTATION_PORT;
                    case 2:
                        return ORIENTATION_LAND;
                    case 3:
                        return ORIENTATION_SQUARE;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<ConfigurationOuterClass.Configuration.Orientation> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor)ConfigurationOuterClass.Configuration.getDescriptor().getEnumTypes().get(6);
            }

            public static ConfigurationOuterClass.Configuration.Orientation valueOf(EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private Orientation(int value) {
                this.value = value;
            }
        }

        public static enum Hdr implements ProtocolMessageEnum {
            HDR_UNSET(0),
            HDR_HIGHDR(1),
            HDR_LOWDR(2),
            UNRECOGNIZED(-1);

            public static final int HDR_UNSET_VALUE = 0;
            public static final int HDR_HIGHDR_VALUE = 1;
            public static final int HDR_LOWDR_VALUE = 2;
            private static final EnumLiteMap<ConfigurationOuterClass.Configuration.Hdr> internalValueMap = new EnumLiteMap<ConfigurationOuterClass.Configuration.Hdr>() {
                public ConfigurationOuterClass.Configuration.Hdr findValueByNumber(int number) {
                    return ConfigurationOuterClass.Configuration.Hdr.forNumber(number);
                }
            };
            private static final ConfigurationOuterClass.Configuration.Hdr[] VALUES = values();
            private final int value;

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } else {
                    return this.value;
                }
            }

            /** @deprecated */
            @Deprecated
            public static ConfigurationOuterClass.Configuration.Hdr valueOf(int value) {
                return forNumber(value);
            }

            public static ConfigurationOuterClass.Configuration.Hdr forNumber(int value) {
                switch(value) {
                    case 0:
                        return HDR_UNSET;
                    case 1:
                        return HDR_HIGHDR;
                    case 2:
                        return HDR_LOWDR;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<ConfigurationOuterClass.Configuration.Hdr> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor)ConfigurationOuterClass.Configuration.getDescriptor().getEnumTypes().get(5);
            }

            public static ConfigurationOuterClass.Configuration.Hdr valueOf(EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private Hdr(int value) {
                this.value = value;
            }
        }

        public static enum WideColorGamut implements ProtocolMessageEnum {
            WIDE_COLOR_GAMUT_UNSET(0),
            WIDE_COLOR_GAMUT_WIDECG(1),
            WIDE_COLOR_GAMUT_NOWIDECG(2),
            UNRECOGNIZED(-1);

            public static final int WIDE_COLOR_GAMUT_UNSET_VALUE = 0;
            public static final int WIDE_COLOR_GAMUT_WIDECG_VALUE = 1;
            public static final int WIDE_COLOR_GAMUT_NOWIDECG_VALUE = 2;
            private static final EnumLiteMap<ConfigurationOuterClass.Configuration.WideColorGamut> internalValueMap = new EnumLiteMap<ConfigurationOuterClass.Configuration.WideColorGamut>() {
                public ConfigurationOuterClass.Configuration.WideColorGamut findValueByNumber(int number) {
                    return ConfigurationOuterClass.Configuration.WideColorGamut.forNumber(number);
                }
            };
            private static final ConfigurationOuterClass.Configuration.WideColorGamut[] VALUES = values();
            private final int value;

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } else {
                    return this.value;
                }
            }

            /** @deprecated */
            @Deprecated
            public static ConfigurationOuterClass.Configuration.WideColorGamut valueOf(int value) {
                return forNumber(value);
            }

            public static ConfigurationOuterClass.Configuration.WideColorGamut forNumber(int value) {
                switch(value) {
                    case 0:
                        return WIDE_COLOR_GAMUT_UNSET;
                    case 1:
                        return WIDE_COLOR_GAMUT_WIDECG;
                    case 2:
                        return WIDE_COLOR_GAMUT_NOWIDECG;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<ConfigurationOuterClass.Configuration.WideColorGamut> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor)ConfigurationOuterClass.Configuration.getDescriptor().getEnumTypes().get(4);
            }

            public static ConfigurationOuterClass.Configuration.WideColorGamut valueOf(EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private WideColorGamut(int value) {
                this.value = value;
            }
        }

        public static enum ScreenRound implements ProtocolMessageEnum {
            SCREEN_ROUND_UNSET(0),
            SCREEN_ROUND_ROUND(1),
            SCREEN_ROUND_NOTROUND(2),
            UNRECOGNIZED(-1);

            public static final int SCREEN_ROUND_UNSET_VALUE = 0;
            public static final int SCREEN_ROUND_ROUND_VALUE = 1;
            public static final int SCREEN_ROUND_NOTROUND_VALUE = 2;
            private static final EnumLiteMap<ConfigurationOuterClass.Configuration.ScreenRound> internalValueMap = new EnumLiteMap<ConfigurationOuterClass.Configuration.ScreenRound>() {
                public ConfigurationOuterClass.Configuration.ScreenRound findValueByNumber(int number) {
                    return ConfigurationOuterClass.Configuration.ScreenRound.forNumber(number);
                }
            };
            private static final ConfigurationOuterClass.Configuration.ScreenRound[] VALUES = values();
            private final int value;

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } else {
                    return this.value;
                }
            }

            /** @deprecated */
            @Deprecated
            public static ConfigurationOuterClass.Configuration.ScreenRound valueOf(int value) {
                return forNumber(value);
            }

            public static ConfigurationOuterClass.Configuration.ScreenRound forNumber(int value) {
                switch(value) {
                    case 0:
                        return SCREEN_ROUND_UNSET;
                    case 1:
                        return SCREEN_ROUND_ROUND;
                    case 2:
                        return SCREEN_ROUND_NOTROUND;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<ConfigurationOuterClass.Configuration.ScreenRound> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor)ConfigurationOuterClass.Configuration.getDescriptor().getEnumTypes().get(3);
            }

            public static ConfigurationOuterClass.Configuration.ScreenRound valueOf(EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private ScreenRound(int value) {
                this.value = value;
            }
        }

        public static enum ScreenLayoutLong implements ProtocolMessageEnum {
            SCREEN_LAYOUT_LONG_UNSET(0),
            SCREEN_LAYOUT_LONG_LONG(1),
            SCREEN_LAYOUT_LONG_NOTLONG(2),
            UNRECOGNIZED(-1);

            public static final int SCREEN_LAYOUT_LONG_UNSET_VALUE = 0;
            public static final int SCREEN_LAYOUT_LONG_LONG_VALUE = 1;
            public static final int SCREEN_LAYOUT_LONG_NOTLONG_VALUE = 2;
            private static final EnumLiteMap<ConfigurationOuterClass.Configuration.ScreenLayoutLong> internalValueMap = new EnumLiteMap<ConfigurationOuterClass.Configuration.ScreenLayoutLong>() {
                public ConfigurationOuterClass.Configuration.ScreenLayoutLong findValueByNumber(int number) {
                    return ConfigurationOuterClass.Configuration.ScreenLayoutLong.forNumber(number);
                }
            };
            private static final ConfigurationOuterClass.Configuration.ScreenLayoutLong[] VALUES = values();
            private final int value;

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } else {
                    return this.value;
                }
            }

            /** @deprecated */
            @Deprecated
            public static ConfigurationOuterClass.Configuration.ScreenLayoutLong valueOf(int value) {
                return forNumber(value);
            }

            public static ConfigurationOuterClass.Configuration.ScreenLayoutLong forNumber(int value) {
                switch(value) {
                    case 0:
                        return SCREEN_LAYOUT_LONG_UNSET;
                    case 1:
                        return SCREEN_LAYOUT_LONG_LONG;
                    case 2:
                        return SCREEN_LAYOUT_LONG_NOTLONG;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<ConfigurationOuterClass.Configuration.ScreenLayoutLong> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor)ConfigurationOuterClass.Configuration.getDescriptor().getEnumTypes().get(2);
            }

            public static ConfigurationOuterClass.Configuration.ScreenLayoutLong valueOf(EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private ScreenLayoutLong(int value) {
                this.value = value;
            }
        }

        public static enum ScreenLayoutSize implements ProtocolMessageEnum {
            SCREEN_LAYOUT_SIZE_UNSET(0),
            SCREEN_LAYOUT_SIZE_SMALL(1),
            SCREEN_LAYOUT_SIZE_NORMAL(2),
            SCREEN_LAYOUT_SIZE_LARGE(3),
            SCREEN_LAYOUT_SIZE_XLARGE(4),
            UNRECOGNIZED(-1);

            public static final int SCREEN_LAYOUT_SIZE_UNSET_VALUE = 0;
            public static final int SCREEN_LAYOUT_SIZE_SMALL_VALUE = 1;
            public static final int SCREEN_LAYOUT_SIZE_NORMAL_VALUE = 2;
            public static final int SCREEN_LAYOUT_SIZE_LARGE_VALUE = 3;
            public static final int SCREEN_LAYOUT_SIZE_XLARGE_VALUE = 4;
            private static final EnumLiteMap<ConfigurationOuterClass.Configuration.ScreenLayoutSize> internalValueMap = new EnumLiteMap<ConfigurationOuterClass.Configuration.ScreenLayoutSize>() {
                public ConfigurationOuterClass.Configuration.ScreenLayoutSize findValueByNumber(int number) {
                    return ConfigurationOuterClass.Configuration.ScreenLayoutSize.forNumber(number);
                }
            };
            private static final ConfigurationOuterClass.Configuration.ScreenLayoutSize[] VALUES = values();
            private final int value;

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } else {
                    return this.value;
                }
            }

            /** @deprecated */
            @Deprecated
            public static ConfigurationOuterClass.Configuration.ScreenLayoutSize valueOf(int value) {
                return forNumber(value);
            }

            public static ConfigurationOuterClass.Configuration.ScreenLayoutSize forNumber(int value) {
                switch(value) {
                    case 0:
                        return SCREEN_LAYOUT_SIZE_UNSET;
                    case 1:
                        return SCREEN_LAYOUT_SIZE_SMALL;
                    case 2:
                        return SCREEN_LAYOUT_SIZE_NORMAL;
                    case 3:
                        return SCREEN_LAYOUT_SIZE_LARGE;
                    case 4:
                        return SCREEN_LAYOUT_SIZE_XLARGE;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<ConfigurationOuterClass.Configuration.ScreenLayoutSize> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor)ConfigurationOuterClass.Configuration.getDescriptor().getEnumTypes().get(1);
            }

            public static ConfigurationOuterClass.Configuration.ScreenLayoutSize valueOf(EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private ScreenLayoutSize(int value) {
                this.value = value;
            }
        }

        public static enum LayoutDirection implements ProtocolMessageEnum {
            LAYOUT_DIRECTION_UNSET(0),
            LAYOUT_DIRECTION_LTR(1),
            LAYOUT_DIRECTION_RTL(2),
            UNRECOGNIZED(-1);

            public static final int LAYOUT_DIRECTION_UNSET_VALUE = 0;
            public static final int LAYOUT_DIRECTION_LTR_VALUE = 1;
            public static final int LAYOUT_DIRECTION_RTL_VALUE = 2;
            private static final EnumLiteMap<ConfigurationOuterClass.Configuration.LayoutDirection> internalValueMap = new EnumLiteMap<ConfigurationOuterClass.Configuration.LayoutDirection>() {
                public ConfigurationOuterClass.Configuration.LayoutDirection findValueByNumber(int number) {
                    return ConfigurationOuterClass.Configuration.LayoutDirection.forNumber(number);
                }
            };
            private static final ConfigurationOuterClass.Configuration.LayoutDirection[] VALUES = values();
            private final int value;

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } else {
                    return this.value;
                }
            }

            /** @deprecated */
            @Deprecated
            public static ConfigurationOuterClass.Configuration.LayoutDirection valueOf(int value) {
                return forNumber(value);
            }

            public static ConfigurationOuterClass.Configuration.LayoutDirection forNumber(int value) {
                switch(value) {
                    case 0:
                        return LAYOUT_DIRECTION_UNSET;
                    case 1:
                        return LAYOUT_DIRECTION_LTR;
                    case 2:
                        return LAYOUT_DIRECTION_RTL;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<ConfigurationOuterClass.Configuration.LayoutDirection> internalGetValueMap() {
                return internalValueMap;
            }

            public final EnumValueDescriptor getValueDescriptor() {
                return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
            }

            public final EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final EnumDescriptor getDescriptor() {
                return (EnumDescriptor)ConfigurationOuterClass.Configuration.getDescriptor().getEnumTypes().get(0);
            }

            public static ConfigurationOuterClass.Configuration.LayoutDirection valueOf(EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                } else {
                    return desc.getIndex() == -1 ? UNRECOGNIZED : VALUES[desc.getIndex()];
                }
            }

            private LayoutDirection(int value) {
                this.value = value;
            }
        }
    }

    public interface ConfigurationOrBuilder extends MessageOrBuilder {
        int getMcc();

        int getMnc();

        java.lang.String getLocale();

        ByteString getLocaleBytes();

        int getLayoutDirectionValue();

        ConfigurationOuterClass.Configuration.LayoutDirection getLayoutDirection();

        int getScreenWidth();

        int getScreenHeight();

        int getScreenWidthDp();

        int getScreenHeightDp();

        int getSmallestScreenWidthDp();

        int getScreenLayoutSizeValue();

        ConfigurationOuterClass.Configuration.ScreenLayoutSize getScreenLayoutSize();

        int getScreenLayoutLongValue();

        ConfigurationOuterClass.Configuration.ScreenLayoutLong getScreenLayoutLong();

        int getScreenRoundValue();

        ConfigurationOuterClass.Configuration.ScreenRound getScreenRound();

        int getWideColorGamutValue();

        ConfigurationOuterClass.Configuration.WideColorGamut getWideColorGamut();

        int getHdrValue();

        ConfigurationOuterClass.Configuration.Hdr getHdr();

        int getOrientationValue();

        ConfigurationOuterClass.Configuration.Orientation getOrientation();

        int getUiModeTypeValue();

        ConfigurationOuterClass.Configuration.UiModeType getUiModeType();

        int getUiModeNightValue();

        ConfigurationOuterClass.Configuration.UiModeNight getUiModeNight();

        int getDensity();

        int getTouchscreenValue();

        ConfigurationOuterClass.Configuration.Touchscreen getTouchscreen();

        int getKeysHiddenValue();

        ConfigurationOuterClass.Configuration.KeysHidden getKeysHidden();

        int getKeyboardValue();

        ConfigurationOuterClass.Configuration.Keyboard getKeyboard();

        int getNavHiddenValue();

        ConfigurationOuterClass.Configuration.NavHidden getNavHidden();

        int getNavigationValue();

        ConfigurationOuterClass.Configuration.Navigation getNavigation();

        int getSdkVersion();

        java.lang.String getProduct();

        ByteString getProductBytes();
    }
}