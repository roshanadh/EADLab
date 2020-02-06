**Lab #2**

**Date** : January 9, 2020

**Aim** : To study about different collaboration workflows in GitHub.

**Submitted by** : Roshan Adhikari (_2016SE28_)

## Collaboration
GitHub allows developers and corporations to maintain private as well as public repositories. This distinction creates the need for two different kinds of workflows for collaboration among developers.

## Collaboration in Private Repositories
GitHub allows developers to collaborate in  private repositories using the 'Add Collaborator' option under the settings of each repository.

Using this, the maintainer of a private repository can add other developers as collaborators. The addition is verified as GitHub sends a confirmation email to the added developer.

## Collaboration in Public Repositories
Since public repositories can be accessed by any developer in a public manner, the collaboration workflow is different here. A developer that intends to contribute to a public repository can _fork_ the repository.

Forking a repository creates a copy of the original (also called **upstream**) repository, including the full history of the changes made to it. The forked repository resides in the new developer's GitHub profile. S/he can then proceed to _clone_ the fork onto their local machine.

Any future changes to the repo can be locally made and pushed to the remote (which is the forked version, not the upstream). When the developer intends to merge their changes to the upstream, they can create a new **Pull Request** in their fork.

The Pull Request is sent to the upstream, which is maintained by a different developer. The Pull Request is reviewd by the maintainer of the upstream repository, and, if it meets the requirements, is merged into the upstream.

This way, many developers can contribute to a single repository as collaborators.

![Collaboration in Public Repositories](https://github.com/roshanadh/EADLab/blob/master/lab2/res/workflow.png)
*[Image Source](https://github.com/Rafase282/My-FreeCodeCamp-Code/wiki/Lesson-Save-your-Code-Revisions-Forever-with-Git)*

## Conclusion

In this lab exercise, we learned about different collaboration workflows in GitHub.
