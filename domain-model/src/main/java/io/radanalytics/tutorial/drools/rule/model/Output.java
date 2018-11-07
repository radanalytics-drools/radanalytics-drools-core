package io.radanalytics.tutorial.drools.rule.model;

import java.io.Serializable;

public class Output implements Serializable {

    private static final long serialVersionUID = 3487061688759950198L;
    private final long count;

    public Output( long count ) {
        this.count = count;
    }

    public long getCount() {
        return count;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) ( count ^ ( count >>> 32 ) );
        return result;
    }

    @Override
    public boolean equals( Object obj ) {
        if ( this == obj ) return true;
        if ( obj == null ) return false;
        if ( getClass() != obj.getClass() ) return false;
        Output other = (Output) obj;
        if ( count != other.count ) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Output [count=" + count + "]";
    }

}
