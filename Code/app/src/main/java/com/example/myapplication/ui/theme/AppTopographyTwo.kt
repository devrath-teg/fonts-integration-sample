package com.example.myapplication.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.myapplication.R

object AppTopographyTwo {


    object SansOsF {

        val sansOsfBold = R.font.sans_osf_bold
        val sansOsfBoldItalic = R.font.sans_osf_bold_italic
        val sansOsfExtraBold = R.font.sans_osf_extra_bold
        val sansOsfExtraBoldItalic = R.font.sans_osf_extra_bold_italic
        val sansOsfLight = R.font.sans_osf_light
        val sansOsfLightItalic = R.font.sans_osf_light_italic
        val sansOsfRegular = R.font.sans_osf_regular
        val sansOsfRegularItalic = R.font.sans_osf_regular_italic
        val sansOsfSemiBold = R.font.sans_osf_semi_bold
        val sansOsfSemiBoldItalic = R.font.sans_osf_semi_bold_italic

        object FontSansOsF {
            val bold: Font = Font(resId = sansOsfBold, weight = FontWeight.W700)
            val boldItalic: Font = Font(resId = sansOsfBoldItalic, weight = FontWeight.W700)
            val extraBold: Font = Font(resId = sansOsfExtraBold, weight = FontWeight.W700)
            val extraBoldItalic: Font = Font(resId = sansOsfExtraBoldItalic, weight = FontWeight.W700)
            val light: Font = Font(resId = sansOsfLight, weight = FontWeight.W400)
            val lightItalic: Font = Font(resId = sansOsfLightItalic, weight = FontWeight.W400)
            val regular: Font = Font(resId = sansOsfRegular, weight = FontWeight.W400)
            val regularItalic: Font = Font(resId = sansOsfRegularItalic, weight = FontWeight.W400)
            val semiBold: Font = Font(resId = sansOsfSemiBold, weight = FontWeight.W700)
            val semiBoldItalic: Font = Font(resId = sansOsfSemiBoldItalic, weight = FontWeight.W700)
        }

        object FontFamilySansOsF {
            val bold: FontFamily = FontFamily(FontSansOsF.bold)
            val boldItalic: FontFamily = FontFamily(FontSansOsF.boldItalic)
            val extraBold: FontFamily = FontFamily(FontSansOsF.extraBold)
            val extraBoldItalic: FontFamily = FontFamily(FontSansOsF.extraBoldItalic)
            val light: FontFamily = FontFamily(FontSansOsF.light)
            val lightItalic: FontFamily = FontFamily(FontSansOsF.lightItalic)
            val regular: FontFamily = FontFamily(FontSansOsF.regular)
            val regularItalic: FontFamily = FontFamily(FontSansOsF.regularItalic)
            val semiBold: FontFamily = FontFamily(FontSansOsF.semiBold)
            val semiBoldItalic: FontFamily = FontFamily(FontSansOsF.semiBoldItalic)
        }

        data class SansOsFTypography(
            val bold: TextStyle = TextStyle(fontFamily = FontFamilySansOsF.bold),
            val boldItalic: TextStyle = TextStyle(fontFamily = FontFamilySansOsF.boldItalic),
            val extraBold: TextStyle = TextStyle(fontFamily = FontFamilySansOsF.extraBold),
            val extraBoldItalic: TextStyle = TextStyle(fontFamily = FontFamilySansOsF.extraBoldItalic),
            val light: TextStyle = TextStyle(fontFamily = FontFamilySansOsF.light),
            val lightItalic: TextStyle = TextStyle(fontFamily = FontFamilySansOsF.lightItalic),
            val regular: TextStyle = TextStyle(fontFamily = FontFamilySansOsF.regular),
            val regularItalic: TextStyle = TextStyle(fontFamily = FontFamilySansOsF.regularItalic),
            val semiBold: TextStyle = TextStyle(fontFamily = FontFamilySansOsF.semiBold),
            val semiBoldItalic: TextStyle = TextStyle(fontFamily = FontFamilySansOsF.semiBoldItalic)
        )


    }

    object SansSc {

        val sansScBold = R.font.sans_sc_bold
        val sansScBoldItalic = R.font.sans_sc_bold_italic
        val sansScExtraBold = R.font.sans_sc_extra_bold
        val sansScExtraBoldItalic = R.font.sans_sc_extra_bold_italic
        val sansScLight = R.font.sans_sc_light
        val sansScLightItalic = R.font.sans_sc_light_italic
        val sansScRegular = R.font.sans_sc_regular
        val sansScRegularItalic = R.font.sans_sc_regular_italic
        val sansScSemiBold = R.font.sans_sc_semi_bold
        val sansScSemiBoldItalic = R.font.sans_sc_semi_bold_italic


        object FontSansSc {

            val bold: Font = Font(resId = sansScBold, weight = FontWeight.W700)
            val boldItalic: Font = Font(resId = sansScBoldItalic, weight = FontWeight.W700)
            val extraBold: Font = Font(resId = sansScExtraBold)
            val extraBoldItalic: Font = Font(resId = sansScExtraBoldItalic)
            val light: Font = Font(resId = sansScLight)
            val lightItalic: Font = Font(resId = sansScLightItalic)
            val regular: Font = Font(resId = sansScRegular, weight = FontWeight.W400)
            val regularItalic: Font = Font(resId = sansScRegularItalic, weight = FontWeight.W400)
            val semiBold: Font = Font(resId = sansScSemiBold)
            val semiBoldItalic: Font = Font(resId = sansScSemiBoldItalic)
        }

        object FontFamilySansSc {
            val bold: FontFamily = FontFamily(FontSansSc.bold)
            val boldItalic: FontFamily = FontFamily(FontSansSc.boldItalic)
            val extraBold: FontFamily = FontFamily(FontSansSc.extraBold)
            val extraBoldItalic: FontFamily = FontFamily(FontSansSc.extraBoldItalic)
            val light: FontFamily = FontFamily(FontSansSc.light)
            val lightItalic: FontFamily = FontFamily(FontSansSc.lightItalic)
            val regular: FontFamily = FontFamily(FontSansSc.regular)
            val regularItalic: FontFamily = FontFamily(FontSansSc.regularItalic)
            val semiBold: FontFamily = FontFamily(FontSansSc.semiBold)
            val semiBoldItalic: FontFamily = FontFamily(FontSansSc.semiBoldItalic)
        }

        data class SansScFTypography(
            val bold: TextStyle = TextStyle(fontFamily = FontFamilySansSc.bold),
            val boldItalic: TextStyle = TextStyle(fontFamily = FontFamilySansSc.boldItalic),
            val extraBold: TextStyle = TextStyle(fontFamily = FontFamilySansSc.extraBold),
            val extraBoldItalic: TextStyle = TextStyle(fontFamily = FontFamilySansSc.extraBoldItalic),
            val light: TextStyle = TextStyle(fontFamily = FontFamilySansSc.light),
            val lightItalic: TextStyle = TextStyle(fontFamily = FontFamilySansSc.lightItalic),
            val regular: TextStyle = TextStyle(fontFamily = FontFamilySansSc.regular),
            val regularItalic: TextStyle = TextStyle(fontFamily = FontFamilySansSc.regularItalic),
            val semiBold: TextStyle = TextStyle(fontFamily = FontFamilySansSc.semiBold),
            val semiBoldItalic: TextStyle = TextStyle(fontFamily = FontFamilySansSc.semiBoldItalic)
        )


    }



}