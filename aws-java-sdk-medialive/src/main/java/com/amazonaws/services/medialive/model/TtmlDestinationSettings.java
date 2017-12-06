/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Placeholder documentation for TtmlDestinationSettings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/TtmlDestinationSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TtmlDestinationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * When set to passthrough, passes through style and position information from a TTML-like input source (TTML,
     * SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
     */
    private String styleControl;

    /**
     * When set to passthrough, passes through style and position information from a TTML-like input source (TTML,
     * SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
     * 
     * @param styleControl
     *        When set to passthrough, passes through style and position information from a TTML-like input source
     *        (TTML, SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
     * @see TtmlDestinationStyleControl
     */

    public void setStyleControl(String styleControl) {
        this.styleControl = styleControl;
    }

    /**
     * When set to passthrough, passes through style and position information from a TTML-like input source (TTML,
     * SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
     * 
     * @return When set to passthrough, passes through style and position information from a TTML-like input source
     *         (TTML, SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
     * @see TtmlDestinationStyleControl
     */

    public String getStyleControl() {
        return this.styleControl;
    }

    /**
     * When set to passthrough, passes through style and position information from a TTML-like input source (TTML,
     * SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
     * 
     * @param styleControl
     *        When set to passthrough, passes through style and position information from a TTML-like input source
     *        (TTML, SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TtmlDestinationStyleControl
     */

    public TtmlDestinationSettings withStyleControl(String styleControl) {
        setStyleControl(styleControl);
        return this;
    }

    /**
     * When set to passthrough, passes through style and position information from a TTML-like input source (TTML,
     * SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
     * 
     * @param styleControl
     *        When set to passthrough, passes through style and position information from a TTML-like input source
     *        (TTML, SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TtmlDestinationStyleControl
     */

    public TtmlDestinationSettings withStyleControl(TtmlDestinationStyleControl styleControl) {
        this.styleControl = styleControl.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStyleControl() != null)
            sb.append("StyleControl: ").append(getStyleControl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TtmlDestinationSettings == false)
            return false;
        TtmlDestinationSettings other = (TtmlDestinationSettings) obj;
        if (other.getStyleControl() == null ^ this.getStyleControl() == null)
            return false;
        if (other.getStyleControl() != null && other.getStyleControl().equals(this.getStyleControl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStyleControl() == null) ? 0 : getStyleControl().hashCode());
        return hashCode;
    }

    @Override
    public TtmlDestinationSettings clone() {
        try {
            return (TtmlDestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.TtmlDestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}