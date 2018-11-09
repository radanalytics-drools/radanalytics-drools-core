package io.radanalytics.tutorial.drools.rule.model;

import java.io.Serializable;

public class Input implements Serializable {

    private static final long serialVersionUID = -5513863267614235282L;
    private final String val;
    private boolean valid;

    public Input( String val ) {
        this.val = val;
        this.valid = false;
    }

    public String getVal() {
        return val;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid( boolean valid ) {
        this.valid = valid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( val == null ) ? 0 : val.hashCode() );
        result = prime * result + ( valid ? 1231 : 1237 );
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
        if ( valid != other.valid ) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Input [val=" + val + ", valid=" + valid + "]";
    }

}
