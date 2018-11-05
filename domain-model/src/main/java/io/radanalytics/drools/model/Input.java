package io.radanalytics.drools.model;

import java.io.Serializable;

public class Input implements Serializable {

    private static final long serialVersionUID = -5513863267614235282L;
    private final String val;

    public Input( String val ) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( val == null ) ? 0 : val.hashCode() );
        return result;
    }

    @Override
    public boolean equals( Object obj ) {
        if ( this == obj ) return true;
        if ( obj == null ) return false;
        if ( getClass() != obj.getClass() ) return false;
        Input other = (Input) obj;
        if ( val == null ) {
            if ( other.val != null ) return false;
        } else if ( !val.equals( other.val ) ) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Input [val=" + val + "]";
    }

}
