**Lab #1**

**Date** : January 8, 2020

**Aim** : To study about source code management using Git.

**Submitted by** : Roshan Adhikari (_2016SE28_)

### Theory

Git is a free and open source distributed version control system which is popularly used for tracking changes in source code during a software development lifecycle. Git also allows coordination among developers working on the same project. Rather than have only one single place for the full version history of a software, in Git, ever developer&#39;s working copy of the code is also a repository that can contain the full history of all changes made to the software.

Git is an actively maintained open source project originally developed by Linus Torvalds in 2005. Git is optimized for performance. Committing new changes, branching, merging, and comparing past versions are all optimized for performance. Along with performance, security and flexibility are also some of the prominent characteristics of Git as a version control system.

### Basic Git Commands
**1.** **git init**
```sh
git init [project-name]
```
It initializes the current directory as a git repository for a new or existing project.
For example: 

  ```sh
  git init git-demo
  ```

This command initializes a git repository with the name of git-demo.

**2.** **git clone**
```sh
git clone remote-url
```

It initializes the current directory as a git repository for a new or existing project.
For example: 
```sh
git clone https://www.github.com/roshanadh/git-demo
```
This command initializes a git repository and pulls the history of all changes made in the remote repository.

**3.** **git add**
```sh
git add file-name | .
```

It stages the changes made in the working directory. That is, the changes are added to a staging area/index.
For example: 
```sh
git add index.html
```

This command stages the local changes made in the index.html file.

**4.** **git commit**
```sh
git commit [-m "commit-message"]
```

It commits the changes made to the head, that is, the changes staged in index.
For example: 
```sh
git commit -m "Add index.html file"
```

This command commits the staged changes.

**5.** **git push**
```sh
git push remote-url branch-name
```

It pushes the committed changes in the local repository to the remote repository.
For example: 
```sh
git push origin master
```

This command pushes the changes in the local repository to the master branch of the remote repository (aliased origin).

**6.** **git pull**
```sh
git pull remote-url branch-name
```

It fetches the changes in the remote repository and merges them into the working directory.
For example: 
```sh
git pull origin master
```

This command fetches the changes in the remote repository and merges into the working directory.

**7.** **git remote**
```sh
git remote add remote-name remote-url
```

It connects the local git repository to a remote repository.
For example:

```sh
git remote add origin https://www.github.com/roshanadh/git-demo
```

This command connects the current repository to the specified remote repository using the name &#39;origin&#39;.

**8.** **git branch**
```sh
git branch branch-name
```
It creates a new branch in the working directory.
For example: 
```sh
git branch feature-branch
```

This command creates a new branch called &#39;feature-branch&#39;.

**9.** **git checkout**
```sh
git checkout branch-name
```

It switches to the specified branch.
For example: 
```sh
git checkout feature-branch
```

This command switches to the branch named &#39;feature-branch&#39;.

**10.** **git merge**
```sh
git merge branch-name
```

It merges the specified branch into the active branch.
For example: 
```sh
git merge feature-branch
```

This command merges the changes in the branch named &#39;feature-branch&#39; into the active branch.

### Conclusion

In this lab exercise, we learned how to use Git as a Source Code Management (SCM) tool using some of its basic commands.
