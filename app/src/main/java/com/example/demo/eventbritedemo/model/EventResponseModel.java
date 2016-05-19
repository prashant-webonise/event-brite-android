package com.example.demo.eventbritedemo.model;

import java.util.List;

public class EventResponseModel {

    private PaginationEntity pagination;

    private List<EventsEntity> events;

    public PaginationEntity getPagination() {
        return pagination;
    }

    public void setPagination(PaginationEntity pagination) {
        this.pagination = pagination;
    }

    public List<EventsEntity> getEvents() {
        return events;
    }

    public void setEvents(List<EventsEntity> events) {
        this.events = events;
    }

    public static class PaginationEntity {
        private int object_count;
        private int page_number;
        private int page_size;
        private int page_count;

        public int getObject_count() {
            return object_count;
        }

        public void setObject_count(int object_count) {
            this.object_count = object_count;
        }

        public int getPage_number() {
            return page_number;
        }

        public void setPage_number(int page_number) {
            this.page_number = page_number;
        }

        public int getPage_size() {
            return page_size;
        }

        public void setPage_size(int page_size) {
            this.page_size = page_size;
        }

        public int getPage_count() {
            return page_count;
        }

        public void setPage_count(int page_count) {
            this.page_count = page_count;
        }
    }

    public static class EventsEntity {

        private NameEntity name;
        private DescriptionEntity description;
        private String id;
        private String url;
        private String vanity_url;
        private StartEntity start;
        private EndEntity end;
        private String created;
        private String changed;
        private int capacity;
        private String status;
        private String currency;
        private boolean listed;
        private boolean shareable;
        private boolean online_event;
        private int tx_time_limit;
        private boolean hide_start_date;
        private String locale;
        private boolean is_locked;
        private String privacy_setting;
        private boolean is_series;
        private boolean is_series_parent;
        private boolean is_reserved_seating;
        private String logo_id;
        private String organizer_id;
        private String venue_id;
        private String category_id;
        private Object subcategory_id;
        private String format_id;
        private String resource_uri;

        private LogoEntity logo;

        public NameEntity getName() {
            return name;
        }

        public void setName(NameEntity name) {
            this.name = name;
        }

        public DescriptionEntity getDescription() {
            return description;
        }

        public void setDescription(DescriptionEntity description) {
            this.description = description;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getVanity_url() {
            return vanity_url;
        }

        public void setVanity_url(String vanity_url) {
            this.vanity_url = vanity_url;
        }

        public StartEntity getStart() {
            return start;
        }

        public void setStart(StartEntity start) {
            this.start = start;
        }

        public EndEntity getEnd() {
            return end;
        }

        public void setEnd(EndEntity end) {
            this.end = end;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getChanged() {
            return changed;
        }

        public void setChanged(String changed) {
            this.changed = changed;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public boolean isListed() {
            return listed;
        }

        public void setListed(boolean listed) {
            this.listed = listed;
        }

        public boolean isShareable() {
            return shareable;
        }

        public void setShareable(boolean shareable) {
            this.shareable = shareable;
        }

        public boolean isOnline_event() {
            return online_event;
        }

        public void setOnline_event(boolean online_event) {
            this.online_event = online_event;
        }

        public int getTx_time_limit() {
            return tx_time_limit;
        }

        public void setTx_time_limit(int tx_time_limit) {
            this.tx_time_limit = tx_time_limit;
        }

        public boolean isHide_start_date() {
            return hide_start_date;
        }

        public void setHide_start_date(boolean hide_start_date) {
            this.hide_start_date = hide_start_date;
        }

        public String getLocale() {
            return locale;
        }

        public void setLocale(String locale) {
            this.locale = locale;
        }

        public boolean isIs_locked() {
            return is_locked;
        }

        public void setIs_locked(boolean is_locked) {
            this.is_locked = is_locked;
        }

        public String getPrivacy_setting() {
            return privacy_setting;
        }

        public void setPrivacy_setting(String privacy_setting) {
            this.privacy_setting = privacy_setting;
        }

        public boolean isIs_series() {
            return is_series;
        }

        public void setIs_series(boolean is_series) {
            this.is_series = is_series;
        }

        public boolean isIs_series_parent() {
            return is_series_parent;
        }

        public void setIs_series_parent(boolean is_series_parent) {
            this.is_series_parent = is_series_parent;
        }

        public boolean isIs_reserved_seating() {
            return is_reserved_seating;
        }

        public void setIs_reserved_seating(boolean is_reserved_seating) {
            this.is_reserved_seating = is_reserved_seating;
        }

        public String getLogo_id() {
            return logo_id;
        }

        public void setLogo_id(String logo_id) {
            this.logo_id = logo_id;
        }

        public String getOrganizer_id() {
            return organizer_id;
        }

        public void setOrganizer_id(String organizer_id) {
            this.organizer_id = organizer_id;
        }

        public String getVenue_id() {
            return venue_id;
        }

        public void setVenue_id(String venue_id) {
            this.venue_id = venue_id;
        }

        public String getCategory_id() {
            return category_id;
        }

        public void setCategory_id(String category_id) {
            this.category_id = category_id;
        }

        public Object getSubcategory_id() {
            return subcategory_id;
        }

        public void setSubcategory_id(Object subcategory_id) {
            this.subcategory_id = subcategory_id;
        }

        public String getFormat_id() {
            return format_id;
        }

        public void setFormat_id(String format_id) {
            this.format_id = format_id;
        }

        public String getResource_uri() {
            return resource_uri;
        }

        public void setResource_uri(String resource_uri) {
            this.resource_uri = resource_uri;
        }

        public LogoEntity getLogo() {
            return logo;
        }

        public void setLogo(LogoEntity logo) {
            this.logo = logo;
        }

        public static class NameEntity {
            private String text;
            private String html;

            public NameEntity() {
            }

            public NameEntity(String html) {
                this.html = html;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getHtml() {
                return html;
            }

            public void setHtml(String html) {
                this.html = html;
            }
        }

        public static class DescriptionEntity {
            private String text;
            private String html;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getHtml() {
                return html;
            }

            public void setHtml(String html) {
                this.html = html;
            }
        }

        public static class StartEntity {
            private String timezone;
            private String local;
            private String utc;

            public StartEntity(String timezone, String utc) {
                this.timezone = timezone;
                this.utc = utc;
            }

            public StartEntity(String utc) {
                this.utc = utc;
            }

            public StartEntity() {
            }

            public String getTimezone() {
                return timezone;
            }

            public void setTimezone(String timezone) {
                this.timezone = timezone;
            }

            public String getLocal() {
                return local;
            }

            public void setLocal(String local) {
                this.local = local;
            }

            public String getUtc() {
                return utc;
            }

            public void setUtc(String utc) {
                this.utc = utc;
            }
        }

        public static class EndEntity {
            private String timezone;
            private String local;
            private String utc;

            public EndEntity(String timezone, String utc) {
                this.timezone = timezone;
                this.utc = utc;
            }

            public EndEntity() {
            }

            public String getTimezone() {
                return timezone;
            }

            public void setTimezone(String timezone) {
                this.timezone = timezone;
            }

            public String getLocal() {
                return local;
            }

            public void setLocal(String local) {
                this.local = local;
            }

            public String getUtc() {
                return utc;
            }

            public void setUtc(String utc) {
                this.utc = utc;
            }
        }

        public static class LogoEntity {
            private String id;
            private String url;
            private String aspect_ratio;
            private String edge_color;
            private boolean edge_color_set;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getAspect_ratio() {
                return aspect_ratio;
            }

            public void setAspect_ratio(String aspect_ratio) {
                this.aspect_ratio = aspect_ratio;
            }

            public String getEdge_color() {
                return edge_color;
            }

            public void setEdge_color(String edge_color) {
                this.edge_color = edge_color;
            }

            public boolean isEdge_color_set() {
                return edge_color_set;
            }

            public void setEdge_color_set(boolean edge_color_set) {
                this.edge_color_set = edge_color_set;
            }
        }
    }
}