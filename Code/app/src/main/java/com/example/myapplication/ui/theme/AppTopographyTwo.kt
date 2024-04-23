package com.example.myapplication.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.myapplication.R
import com.example.myapplication.ui.theme.AppTopographyTwo.SundayClarendon.Osf.sundayClarendonOsfBold

object AppTopographyTwo {

    object Serif {

        object Osf {

            val serifOsfBold = R.font.serif_osf_bold
            val serifOsfBoldItalic = R.font.serif_osf_bold_italic
            val serifOsfRegular = R.font.serif_osf_regular
            val serifOsfRegularItalic = R.font.serif_osf_regular_italic


            object FontSerifOsF {
                // Base
                val regular: Font = Font(resId = serifOsfRegular, weight = FontWeight.W400)
                val regularItalic: Font = Font(resId = serifOsfRegularItalic, weight = FontWeight.W400)
                val bold: Font = Font(resId = serifOsfBold, weight = FontWeight.W700)
                val boldItalic: Font = Font(resId = serifOsfBoldItalic, weight = FontWeight.W700)
                // Derived
                val light: Font = regular
                val lightItalic: Font = regularItalic
                val medium: Font = Font(resId = serifOsfRegular, weight = FontWeight.W300)
                val mediumItalic: Font = regularItalic
                val semiBold: Font = bold
                val semiBoldItalic: Font = boldItalic
                val extraBold: Font = bold
                val extraBoldItalic: Font = boldItalic
                val black: Font = bold
                val blackItalic: Font = boldItalic

            }

            object FontFamilySerifOsF {
                // Base
                val regular: FontFamily = FontFamily(FontSerifOsF.regular)
                val regularItalic: FontFamily = FontFamily(FontSerifOsF.regularItalic)
                val bold: FontFamily = FontFamily(FontSerifOsF.bold)
                val boldItalic: FontFamily = FontFamily(FontSerifOsF.boldItalic)
                // Derived
                val light: FontFamily = FontFamily(FontSerifOsF.light)
                val lightItalic: FontFamily = FontFamily(FontSerifOsF.lightItalic)
                val medium: FontFamily = FontFamily(FontSerifOsF.medium)
                val mediumItalic: FontFamily = FontFamily(FontSerifOsF.mediumItalic)
                val semiBold: FontFamily = FontFamily(FontSerifOsF.semiBold)
                val semiBoldItalic: FontFamily = FontFamily(FontSerifOsF.semiBoldItalic)
                val extraBold: FontFamily = FontFamily(FontSerifOsF.extraBold)
                val extraBoldItalic: FontFamily = FontFamily(FontSerifOsF.extraBoldItalic)
                val black: FontFamily = FontFamily(FontSerifOsF.black)
                val blackItalic: FontFamily = FontFamily(FontSerifOsF.blackItalic)
            }

            data class PrimarySerifOsf(
                // Base
                val regular: TextStyle = TextStyle(fontFamily = FontFamilySerifOsF.regular),
                val regularItalic: TextStyle = TextStyle(fontFamily = FontFamilySerifOsF.regularItalic),
                val bold: TextStyle = TextStyle(fontFamily = FontFamilySerifOsF.bold),
                val boldItalic: TextStyle = TextStyle(fontFamily = FontFamilySerifOsF.boldItalic),
                // Derived
                val light: TextStyle = TextStyle(fontFamily = FontFamilySerifOsF.light),
                val lightItalic: TextStyle = TextStyle(fontFamily = FontFamilySerifOsF.lightItalic),
                val medium: TextStyle = TextStyle(fontFamily = FontFamilySerifOsF.medium),
                val mediumItalic: TextStyle = TextStyle(fontFamily = FontFamilySerifOsF.mediumItalic),
                val semiBold: TextStyle = TextStyle(fontFamily = FontFamilySerifOsF.semiBold),
                val semiBoldItalic: TextStyle = TextStyle(fontFamily = FontFamilySerifOsF.semiBoldItalic),
                val extraBold: TextStyle = TextStyle(fontFamily = FontFamilySerifOsF.extraBold),
                val extraBoldItalic: TextStyle = TextStyle(fontFamily = FontFamilySerifOsF.extraBoldItalic),
                val black: TextStyle = TextStyle(fontFamily = FontFamilySerifOsF.black),
                val blackItalic: TextStyle = TextStyle(fontFamily = FontFamilySerifOsF.blackItalic),
            )

        }

        object Sc {

            val serifScBold = R.font.serif_sc_bold
            val serifScBoldItalic = R.font.serif_sc_bold_italic
            val serifScRegular = R.font.serif_sc_regular
            val serifScRegularItalic = R.font.serif_sc_regular_italic

            object FontSerifSc {
                val regular: Font = Font(resId = serifScRegular, weight = FontWeight.W400)
                val regularItalic: Font = Font(resId = serifScRegularItalic, weight = FontWeight.W400)
                val bold: Font = Font(resId = serifScBold, weight = FontWeight.W700)
                val boldItalic: Font = Font(resId = serifScBoldItalic, weight = FontWeight.W700)
            }

            object FontFamilySerifSc {
                val regular: FontFamily = FontFamily(FontSerifSc.regular)
                val regularItalic: FontFamily = FontFamily(FontSerifSc.regularItalic)
                val bold: FontFamily = FontFamily(FontSerifSc.bold)
                val boldItalic: FontFamily = FontFamily(FontSerifSc.boldItalic)
            }

            data class PrimarySerifSc(
                val regular: TextStyle = TextStyle(fontFamily = FontFamilySerifSc.regular),
                val regularItalic: TextStyle = TextStyle(fontFamily = FontFamilySerifSc.regularItalic),
                val bold: TextStyle = TextStyle(fontFamily = FontFamilySerifSc.bold),
                val boldItalic: TextStyle = TextStyle(fontFamily = FontFamilySerifSc.boldItalic)
            )

        }

        object Lf {

            val serifLfBold = R.font.serif_lf_bold
            val serifLfBoldItalic = R.font.serif_lf_bold_italic
            val serifLfRegular = R.font.serif_lf_regular
            val serifLfRegularItalic = R.font.serif_lf_regular_italic
            val serifLfMedium = R.font.serif_lf_medium
            val serifLfMediumItalic = R.font.serif_lf_medium_italic

            object FontSerifLf {
                val bold: Font = Font(resId = serifLfBold, weight = FontWeight.W700)
                val boldItalic: Font = Font(resId = serifLfBoldItalic, weight = FontWeight.W700)
                val regular: Font = Font(resId = serifLfRegular, weight = FontWeight.W400)
                val regularItalic: Font = Font(resId = serifLfRegularItalic, weight = FontWeight.W400)
                val medium: Font = Font(resId = serifLfMedium, weight = FontWeight.W500)
                val mediumItalic: Font = Font(resId = serifLfMediumItalic, weight = FontWeight.W500)
            }

            object FontFamilySerifLf {
                val bold: FontFamily = FontFamily(FontSerifLf.bold)
                val boldItalic: FontFamily = FontFamily(FontSerifLf.boldItalic)
                val regular: FontFamily = FontFamily(FontSerifLf.regular)
                val regularItalic: FontFamily = FontFamily(FontSerifLf.regularItalic)
                val medium: FontFamily = FontFamily(FontSerifLf.medium)
                val mediumItalic: FontFamily = FontFamily(FontSerifLf.mediumItalic)
            }

            data class PrimarySerifLf(
                val bold: TextStyle = TextStyle(fontFamily = FontFamilySerifLf.bold),
                val boldItalic: TextStyle = TextStyle(fontFamily = FontFamilySerifLf.boldItalic),
                val regular: TextStyle = TextStyle(fontFamily = FontFamilySerifLf.regular),
                val regularItalic: TextStyle = TextStyle(fontFamily = FontFamilySerifLf.regularItalic),
                val medium: TextStyle = TextStyle(fontFamily = FontFamilySerifLf.medium),
                val mediumItalic: TextStyle = TextStyle(fontFamily = FontFamilySerifLf.mediumItalic),
            )

        }

    }

    object Sans {

        object Osf {

            val sansOsfLight = R.font.sans_osf_light
            val sansOsfLightItalic = R.font.sans_osf_light_italic
            val sansOsfRegular = R.font.sans_osf_regular
            val sansOsfRegularItalic = R.font.sans_osf_regular_italic
            val sansOsfSemiBold = R.font.sans_osf_semi_bold
            val sansOsfSemiBoldItalic = R.font.sans_osf_semi_bold_italic
            val sansOsfBold = R.font.sans_osf_bold
            val sansOsfBoldItalic = R.font.sans_osf_bold_italic
            val sansOsfExtraBold = R.font.sans_osf_extra_bold
            val sansOsfExtraBoldItalic = R.font.sans_osf_extra_bold_italic

            object FontSansOsf {
                val light: Font = Font(resId = sansOsfLight, weight = FontWeight.W300)
                val lightItalic: Font = Font(resId = sansOsfLightItalic, weight = FontWeight.W300)
                val regular: Font = Font(resId = sansOsfRegular, weight = FontWeight.W400)
                val regularItalic: Font = Font(resId = sansOsfRegularItalic, weight = FontWeight.W400)
                val semiBold: Font = Font(resId = sansOsfSemiBold, weight = FontWeight.W600)
                val semiBoldItalic: Font = Font(resId = sansOsfSemiBoldItalic, weight = FontWeight.W600)
                val bold: Font = Font(resId = sansOsfBold, weight = FontWeight.W700)
                val boldItalic: Font = Font(resId = sansOsfBoldItalic, weight = FontWeight.W700)
                val extraBold: Font = Font(resId = sansOsfExtraBold, weight = FontWeight.W800)
                val extraBoldItalic: Font = Font(resId = sansOsfExtraBoldItalic, weight = FontWeight.W800)
            }

            object FontFamilySansOsf {
                val light: FontFamily = FontFamily(FontSansOsf.light)
                val lightItalic: FontFamily = FontFamily(FontSansOsf.lightItalic)
                val regular: FontFamily = FontFamily(FontSansOsf.regular)
                val regularItalic: FontFamily = FontFamily(FontSansOsf.regularItalic)
                val semiBold: FontFamily = FontFamily(FontSansOsf.semiBold)
                val semiBoldItalic: FontFamily = FontFamily(FontSansOsf.semiBoldItalic)
                val bold: FontFamily = FontFamily(FontSansOsf.bold)
                val boldItalic: FontFamily = FontFamily(FontSansOsf.boldItalic)
                val extraBold: FontFamily = FontFamily(FontSansOsf.extraBold)
                val extraBoldItalic: FontFamily = FontFamily(FontSansOsf.extraBoldItalic)
            }

            data class PrimarySansOsf(
                val light: TextStyle = TextStyle(fontFamily = FontFamilySansOsf.light),
                val lightItalic: TextStyle = TextStyle(fontFamily = FontFamilySansOsf.lightItalic),
                val regular: TextStyle = TextStyle(fontFamily = FontFamilySansOsf.regular),
                val regularItalic: TextStyle = TextStyle(fontFamily = FontFamilySansOsf.regularItalic),
                val semiBold: TextStyle = TextStyle(fontFamily = FontFamilySansOsf.semiBold),
                val semiBoldItalic: TextStyle = TextStyle(fontFamily = FontFamilySansOsf.semiBoldItalic),
                val bold: TextStyle = TextStyle(fontFamily = FontFamilySansOsf.bold),
                val boldItalic: TextStyle = TextStyle(fontFamily = FontFamilySansOsf.boldItalic),
                val extraBold: TextStyle = TextStyle(fontFamily = FontFamilySansOsf.extraBold),
                val extraBoldItalic: TextStyle = TextStyle(fontFamily = FontFamilySansOsf.extraBoldItalic),
            )

        }

        object Sc {

            val sansScLight = R.font.sans_sc_light
            val sansScLightItalic = R.font.sans_sc_light_italic
            val sansScRegular = R.font.sans_sc_regular
            val sansScRegularItalic = R.font.sans_sc_regular_italic
            val sansScSemiBold = R.font.sans_sc_semi_bold
            val sansScSemiBoldItalic = R.font.sans_sc_semi_bold_italic
            val sansScBold = R.font.sans_sc_bold
            val sansScBoldItalic = R.font.sans_sc_bold_italic
            val sansScExtraBold = R.font.sans_sc_extra_bold
            val sansScExtraBoldItalic = R.font.sans_sc_extra_bold_italic

            object FontSansSc {
                val light: Font = Font(resId = sansScLight, weight = FontWeight.W300)
                val lightItalic: Font = Font(resId = sansScLightItalic, weight = FontWeight.W300)
                val regular: Font = Font(resId = sansScRegular, weight = FontWeight.W400)
                val regularItalic: Font = Font(resId = sansScRegularItalic, weight = FontWeight.W400)
                val semiBold: Font = Font(resId = sansScSemiBold, weight = FontWeight.W600)
                val semiBoldItalic: Font = Font(resId = sansScSemiBoldItalic, weight = FontWeight.W600)
                val bold: Font = Font(resId = sansScBold, weight = FontWeight.W700)
                val boldItalic: Font = Font(resId = sansScBoldItalic, weight = FontWeight.W700)
                val extraBold: Font = Font(resId = sansScExtraBold, weight = FontWeight.W800)
                val extraBoldItalic: Font = Font(resId = sansScExtraBoldItalic, weight = FontWeight.W800)
            }

            object FontFamilySansSc {
                val light: FontFamily = FontFamily(Sc.FontSansSc.light)
                val lightItalic: FontFamily = FontFamily(Sc.FontSansSc.lightItalic)
                val regular: FontFamily = FontFamily(Sc.FontSansSc.regular)
                val regularItalic: FontFamily = FontFamily(Sc.FontSansSc.regularItalic)
                val semiBold: FontFamily = FontFamily(Sc.FontSansSc.semiBold)
                val semiBoldItalic: FontFamily = FontFamily(Sc.FontSansSc.semiBoldItalic)
                val bold: FontFamily = FontFamily(Sc.FontSansSc.bold)
                val boldItalic: FontFamily = FontFamily(Sc.FontSansSc.boldItalic)
                val extraBold: FontFamily = FontFamily(Sc.FontSansSc.extraBold)
                val extraBoldItalic: FontFamily = FontFamily(Sc.FontSansSc.extraBoldItalic)
            }

            data class PrimarySansSc(
                val light: TextStyle = TextStyle(fontFamily = FontFamilySansSc.light),
                val lightItalic: TextStyle = TextStyle(fontFamily = FontFamilySansSc.lightItalic),
                val regular: TextStyle = TextStyle(fontFamily = FontFamilySansSc.regular),
                val regularItalic: TextStyle = TextStyle(fontFamily = FontFamilySansSc.regularItalic),
                val semiBold: TextStyle = TextStyle(fontFamily = FontFamilySansSc.semiBold),
                val semiBoldItalic: TextStyle = TextStyle(fontFamily = FontFamilySansSc.semiBoldItalic),
                val bold: TextStyle = TextStyle(fontFamily = FontFamilySansSc.bold),
                val boldItalic: TextStyle = TextStyle(fontFamily = FontFamilySansSc.boldItalic),
                val extraBold: TextStyle = TextStyle(fontFamily = FontFamilySansSc.extraBold),
                val extraBoldItalic: TextStyle = TextStyle(fontFamily = FontFamilySansSc.extraBoldItalic),
            )


        }

        object Lf {

            val sansLfRegular = R.font.sans_lf_regular
            val sansLfRegularItalic = R.font.sans_lf_regular_italic
            val sansLfMedium = R.font.sans_lf_medium
            val sansLfMediumItalic = R.font.sans_lf_medium_italic
            val sansLfSemiBold = R.font.sans_lf_semi_bold
            val sansLfSemiBoldItalic = R.font.sans_lf_semi_bold_italic
            val sansLfBold = R.font.sans_lf_bold
            val sansLfBoldItalic = R.font.sans_lf_bold_italic
            val sansLfExtraBold = R.font.sans_lf_extra_bold
            val sansLfExtraBoldItalic = R.font.sans_lf_extra_bold_italic

            object FontSansLf {
                val regular: Font = Font(resId = sansLfRegular, weight = FontWeight.W400)
                val regularItalic: Font = Font(resId = sansLfRegularItalic, weight = FontWeight.W400)
                val light: Font = regular
                val lightItalic: Font = regularItalic
                val medium: Font = Font(resId =sansLfMedium, weight = FontWeight.W500)
                val mediumItalic: Font = Font(resId = sansLfMediumItalic, weight = FontWeight.W500)
                val semiBold: Font = Font(resId = sansLfSemiBold, weight = FontWeight.W600)
                val semiBoldItalic: Font = Font(resId = sansLfSemiBoldItalic, weight = FontWeight.W600)
                val bold: Font = Font(resId = sansLfBold, weight = FontWeight.W700)
                val boldItalic: Font = Font(resId = sansLfBoldItalic, weight = FontWeight.W700)
                val extraBold: Font = Font(resId = sansLfExtraBold, weight = FontWeight.W800)
                val extraBoldItalic: Font = Font(resId = sansLfExtraBoldItalic, weight = FontWeight.W800)
                val black: Font = extraBold
                val blackItalic: Font = extraBoldItalic
            }

            object FontFamilySansLf {
                val light: FontFamily = FontFamily(Lf.FontSansLf.light)
                val lightItalic: FontFamily = FontFamily(Lf.FontSansLf.lightItalic)
                val regular: FontFamily = FontFamily(Lf.FontSansLf.regular)
                val regularItalic: FontFamily = FontFamily(Lf.FontSansLf.regularItalic)
                val medium: FontFamily = FontFamily(Lf.FontSansLf.medium)
                val mediumItalic: FontFamily = FontFamily(Lf.FontSansLf.mediumItalic)
                val semiBold: FontFamily = FontFamily(Lf.FontSansLf.semiBold)
                val semiBoldItalic: FontFamily = FontFamily(Lf.FontSansLf.semiBoldItalic)
                val bold: FontFamily = FontFamily(Lf.FontSansLf.bold)
                val boldItalic: FontFamily = FontFamily(Lf.FontSansLf.boldItalic)
                val extraBold: FontFamily = FontFamily(Lf.FontSansLf.extraBold)
                val extraBoldItalic: FontFamily = FontFamily(Lf.FontSansLf.extraBoldItalic)
                val black: FontFamily = FontFamily(Lf.FontSansLf.black)
                val blackItalic: FontFamily = FontFamily(Lf.FontSansLf.blackItalic)
            }

            data class PrimarySansLf(
                val light: TextStyle = TextStyle(fontFamily = FontFamilySansLf.light),
                val lightItalic: TextStyle = TextStyle(fontFamily = FontFamilySansLf.lightItalic),
                val regular: TextStyle = TextStyle(fontFamily = FontFamilySansLf.regular),
                val regularItalic: TextStyle = TextStyle(fontFamily = FontFamilySansLf.regularItalic),
                val medium: TextStyle = TextStyle(fontFamily = FontFamilySansLf.medium),
                val mediumItalic: TextStyle = TextStyle(fontFamily = FontFamilySansLf.mediumItalic),
                val semiBold: TextStyle = TextStyle(fontFamily = FontFamilySansLf.semiBold),
                val semiBoldItalic: TextStyle = TextStyle(fontFamily = FontFamilySansLf.semiBoldItalic),
                val bold: TextStyle = TextStyle(fontFamily = FontFamilySansLf.bold),
                val boldItalic: TextStyle = TextStyle(fontFamily = FontFamilySansLf.boldItalic),
                val extraBold: TextStyle = TextStyle(fontFamily = FontFamilySansLf.extraBold),
                val extraBoldItalic: TextStyle = TextStyle(fontFamily = FontFamilySansLf.extraBoldItalic),
                val black: TextStyle = TextStyle(fontFamily = FontFamilySansLf.black),
                val blackItalic: TextStyle = TextStyle(fontFamily = FontFamilySansLf.blackItalic),
            )

        }

    }

    object SundayClarendon {

        object Osf {

            val sundayClarendonOsfBold = R.font.sunday_clarendon_osf_bold

            object FontSundayClarendonOsf {
                val bold: Font = Font(resId = sundayClarendonOsfBold, weight = FontWeight.W700)
            }

            object FontFamilySundayClarendonOsf {
                val bold: FontFamily = FontFamily(FontSundayClarendonOsf.bold)
            }

            data class Secondary1843Osf(
                val bold: TextStyle = TextStyle(fontFamily = FontFamilySundayClarendonOsf.bold)
            )
        }

        object Lf {

            val sundayClarendonLfBold = R.font.sunday_clarendon_lf_bold

            object FontSundayClarendonLf {
                val bold: Font = Font(resId = sundayClarendonLfBold, weight = FontWeight.W700)
            }

            object FontFamilySundayClarendonLf {
                val bold: FontFamily = FontFamily(FontSundayClarendonLf.bold)
            }

            data class Secondary1843Lf(
                val bold: TextStyle = TextStyle(fontFamily = FontFamilySundayClarendonLf.bold)
            )
        }

    }

}