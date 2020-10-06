package com.example.resthelloworld.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataSFFilmLocation {

    private Meta meta;

    private List<List<Object>> data;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(final Meta meta) {
        this.meta = meta;
    }

    public List<List<Object>> getData() {
        return data;
    }

    public void setData(final List<List<Object>> data) {
        this.data = data;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Meta {
        private View view;

        public View getView() {
            return view;
        }

        public void setView(final View view) {
            this.view = view;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class View {
        private List<ColumnInfo> columns;

        public List<ColumnInfo> getColumns() {
            return columns;
        }

        public void setColumns(final List<ColumnInfo> columns) {
            this.columns = columns;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ColumnInfo {
        private String fieldName;

        public String getFieldName() {
            return fieldName;
        }

        public void setFieldName(final String fieldName) {
            this.fieldName = fieldName;
        }
    }
}
