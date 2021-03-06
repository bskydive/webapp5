package ru.javawebinar.webapp.model;

/**
 * GKislin
 * 19.12.2014.
 */
public class Link {
    public static Link EMPTY = new Link();

    private final String name;
    private final String url;

    public Link() {
        this("", null);
    }

    public Link(Link link) {
        this(link.name, link.url);
    }

    public Link(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public static Link empty() {
        return EMPTY;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Link link = (Link) o;

        if (!name.equals(link.name)) return false;
        if (url != null ? !url.equals(link.url) : link.url != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Link{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
