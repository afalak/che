/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.api.git.shared;

import org.eclipse.che.dto.shared.DTO;

/**
 * Response of the show file content command.
 *
 * @author Igor Vinokur
 */
@DTO
public interface ShowFileContentResponse extends Log {
    /** @return content of the file */
    String getContent();

    /** set content of the file */
    void setContent(String content);

    /** @return response with established file content */
    ShowFileContentResponse withContent(String content);
}