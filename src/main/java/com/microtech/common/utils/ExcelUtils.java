//package com.microtech.common.utils;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.poi.ss.usermodel.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Slf4j
//public class ExcelUtils {
//
//    public static Map<String, CellStyle> createStyles(Workbook wb) {
//        Map<String, CellStyle> styles = new HashMap<>();
//        final String font = "Times New Roman";
//        Font headerFont = wb.createFont();
//        headerFont.setBold(false);
//        headerFont.setFontName(font);
//        headerFont.setFontHeight((short) 360);
//
//        Font subHeaderFont = wb.createFont();
//        subHeaderFont.setBold(false);
//        subHeaderFont.setFontName(font);
//        subHeaderFont.setFontHeight((short) 240);
//
//        Font cellTitleFont = wb.createFont();
//        cellTitleFont.setBold(false);
//        cellTitleFont.setFontName(font);
//        cellTitleFont.setFontHeight((short) 240);
//
//        Font cellDataFont = wb.createFont();
//        cellDataFont.setBold(false);
//        cellDataFont.setFontName(font);
//        cellDataFont.setFontHeight((short) 240); // hanm13 SUA_GIAO_DIEN 16/03/2017
//
//        CellStyle styleHeader = wb.createCellStyle();
//        styleHeader.setAlignment(HorizontalAlignment.CENTER);
//        styleHeader.setFont(headerFont);
//        styleHeader.setWrapText(true);
//        styleHeader.setVerticalAlignment(VerticalAlignment.CENTER);
//        styles.put("header", styleHeader);
//
//        CellStyle subHeaderLeft = wb.createCellStyle();
//        subHeaderLeft.setFont(subHeaderFont);
//        subHeaderLeft.setWrapText(true);
//        styles.put("subHeaderLeft", subHeaderLeft);
//
//        CellStyle subHeaderCenter = wb.createCellStyle();
//        subHeaderCenter.setFont(subHeaderFont);
//        subHeaderCenter.setAlignment(HorizontalAlignment.CENTER);
//        subHeaderCenter.setWrapText(true);
//        subHeaderCenter.setVerticalAlignment(VerticalAlignment.CENTER);
//        styles.put("subHeaderCenter", subHeaderCenter);
//
//        CellStyle cellBoldCenter = wb.createCellStyle();
//        cellBoldCenter.setFont(cellTitleFont);
//        cellBoldCenter.setAlignment(HorizontalAlignment.CENTER);
//        styles.put("cellBoldCenter", cellBoldCenter);
//
//        CellStyle cellBoldLeft = wb.createCellStyle();
//        cellBoldLeft.setFont(cellTitleFont);
//        cellBoldLeft.setAlignment(HorizontalAlignment.LEFT);
//        styles.put("cellBoldLeft", cellBoldLeft);
//
//        CellStyle cellBoldRight = wb.createCellStyle();
//        cellBoldRight.setFont(cellTitleFont);
//        cellBoldRight.setAlignment(HorizontalAlignment.RIGHT);
//        styles.put("cellBoldRight", cellBoldRight);
//
//        CellStyle cellColTitle = createBorderedStyle(wb);
//        cellColTitle.setFont(cellTitleFont);
//        cellColTitle.setAlignment(HorizontalAlignment.CENTER);
//        cellColTitle.setFillForegroundColor(IndexedColors.PALE_BLUE.getIndex());
//        cellColTitle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//        cellColTitle.setWrapText(true);
//        cellColTitle.setVerticalAlignment(VerticalAlignment.CENTER);
//        styles.put("cellColumnTitle", cellColTitle);
//
//        CellStyle cellDataLeft = createBorderedStyle(wb);
//        cellDataLeft.setFont(cellDataFont);
//        cellDataLeft.setAlignment(HorizontalAlignment.LEFT);
//        cellDataLeft.setWrapText(true);
//        styles.put("cellDataLeft", cellDataLeft);
//
//        CellStyle cellDataRight = createBorderedStyle(wb);
//        cellDataRight.setFont(cellDataFont);
//        cellDataRight.setWrapText(true);
//        cellDataRight.setAlignment(HorizontalAlignment.RIGHT);
//        styles.put("cellDataRight", cellDataRight);
//
//        CellStyle cellDataCenter = createBorderedStyle(wb);
//        cellDataCenter.setFont(cellDataFont);
//        cellDataCenter.setAlignment(HorizontalAlignment.CENTER);
//        cellDataCenter.setVerticalAlignment(VerticalAlignment.CENTER);
//        cellDataCenter.setWrapText(true);
//        styles.put("cellDataCenter", cellDataCenter);
//
//        CellStyle hlink_style = createBorderedStyle(wb);
//        Font hlink_font = wb.createFont();
//        hlink_font.setUnderline(Font.U_SINGLE);
//        hlink_font.setColor(IndexedColors.BLUE.getIndex());
//        hlink_style.setWrapText(true);
//        hlink_style.setFont(hlink_font);
//
//        styles.put("cellHyperLinkLeft", hlink_style);
//
//        return styles;
//    }
//
//    public static CellStyle createBorderedStyle(Workbook wb) {
//        CellStyle style = wb.createCellStyle();
//        style.setBorderRight(BorderStyle.THIN);
//        style.setRightBorderColor(IndexedColors.BLACK.getIndex());
//        style.setBorderBottom(BorderStyle.THIN);
//        style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
//        style.setBorderLeft(BorderStyle.THIN);
//        style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
//        style.setBorderTop(BorderStyle.THIN);
//        style.setTopBorderColor(IndexedColors.BLACK.getIndex());
//        return style;
//    }
//
//
//    public static Row createRow(Sheet sheet, int line) {
//        Row xRow = sheet.getRow(line);
//        if (xRow == null) {
//            xRow = sheet.createRow(line);
//        }
//        return xRow;
//    }
//
//    public static void createCell(Row row, int column, String value, CellStyle style) {
//        Cell xCell = row.getCell(column);
//        if (xCell == null) {
//            xCell = row.createCell(column);
//        }
//        xCell.setCellValue(value);
//        if (style != null) {
//            xCell.setCellStyle(style);
//        }
//    }
//}
