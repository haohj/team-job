package com.hao.teamjob.domian;

import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.errors.MissingObjectException;
import org.eclipse.jgit.errors.StopWalkException;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.revwalk.filter.RevFilter;

import java.io.IOException;

/**
 * @author haohj
 * @date 2019-12-11 10:28
 */
public class TimeFilter extends RevFilter {
    @Override
    public boolean include(RevWalk revWalk, RevCommit revCommit) throws StopWalkException, MissingObjectException, IncorrectObjectTypeException, IOException {
        return false;
    }

    @Override
    public RevFilter clone() {
        return null;
    }
}
