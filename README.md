# UMCS 自学指南

## 笔记起源

受 [CS自学指南](https://csdiy.wiki/) 启发，我想写一份有关 UMCS (University Malaya - Computer Science) 的自学指南。起初，我通过写笔记来帮助理解。在此期间，我也把我所思所想分享予人。助人使人快乐；久而久之，我便萌生了想要系统化地整理、组织这些笔记的念头，让后来者无需为自学而发愁。

简而言之，我写这份仓库（Repository，俗称 Repo）的原因是：

- 加深自己对课件（Lecture Note）的理解
- 方便自己和其他人复习，交换所得
- 帮助学弟妹少走些弯路
- 回顾自己在大学生涯究竟学了些什么

我也相信“理解的相邻可能”，即这些笔记终将成为我未来学习其他知识的积累。相信这些笔记也可以成为我面试路上的强大助力。

## 如何使用本仓库？

本仓库使用 Obsidian 进行 Markdown 写作，并使用了其中的双向链接、标签等功能。个人也推荐使用 Obsidian 打开本仓库，享受双向链接对学习的帮助。

## 笔记选择

有人问：为什么不用 GDocs 而选择 Markdown 呢？有几点原因：

- 一，GDocs 提供的功能过于丰富，容易让自制力不强的我分心
- 二，GDocs 需要联网，而 Markdown 不需要
- 三，Markdown 的 Styling 更简单，特别是用 chatGPT 的时候

虽然 GDocs 支持 **实时更新** 和 **自定义权限**，但这两者对我的帮助也不大。

而且，Git 版本控制可以提供集中化、原子化的提交信息。这些信息可以更好地反映当前情况。最重要的是，Markdown 永远都是自己的————备份什么的，都很简单。

对部分需要更多可视化的笔记，我还是会选择 Google Docs。

## 学习理念

我个人的学习理念是：

- **帕勒托定律**：每次学习时，选择 20% 最重要的部分进行研读。
- **原子化练习**：每次都针对薄弱处进行练习。

如此迭代，那每次都能用事半功倍。因此，我会有许多笔记，如 `note` 和 `sum`，这些都是迭代的痕迹。

- 如果要体系化的学习，可以直接阅读 Lecture Note。
- 如果你寻求相对完整的内容，可以参考 `note`。
- 如果你只想复习重点，可以参考 `sum`。

## 关于 Commit Message

受 [CommitLint](https://github.com/conventional-changelog/commitlint) 的启发，我会按照以下格式写提交说明。

`[CHANGES-TYPE] <commit-message>`

`CHANGES-TYPE` 有：`exam`, `note`, `sum`, `fix`, `prac`

| TYPE | Explanation              |
| ---- | ------------------------ |
| exam | 历年考卷的答案                  |
| note | 日常学习的笔记                  |
| sum  | 结合了**历年考题**与**课件要点** 的总结 |
| fix  | 对笔记或答案的订正                |
| prac | 原创的一些练习题                 |

例子：

- `[exam]: add OS-2017-1` 即新增 OS (Operating System) 2016/2017 Semester 1 的考题
- `[note]: del ALGO-Hash-Probing` 即移除了 ALGO (Algorithm) 的 Probing 笔记

## 关于文件命名

由于本仓库将收录除 UMCS 外的笔记，因此本仓库的结构如下：

- `#CS` - 收录除了 UMCS 之外的笔记
- `#UMCS/` - 收录 UMCS 的笔记
- `@images` - 收录所有照片
- `.obsidian` - 收录 Obsidian 的配置信息

所有文件都将按照以下格式命名：

- `um-<course-code>-<abbr>-<section>` 用于 UMCS 的课程
- `cs-<course-code>-<abbr>-<section>` 用于非 UMCS 的课程
- `cs-<abbr>-<section>` - 用于非课程类笔记

## 英文版本简介

Inspired by [CS自学指南](https://csdiy.wiki/), I want to create a version specifically designed for UM students.

This repository began as a personal journey to understand academic concepts, particularly algorithms, which I found incredibly challenging. To better grasp WIA2004 Algorithm Design and Analysis, I started writing my own notes using Obsidian as my markdown editor. As finals approached, these notes became my lifeline, helping me answer past exam questions. When my friends asked for my answers, I realized that using Google Docs was inefficient—it required an internet connection, had a slow startup, and a distracting interface. So, I turned to GitHub for backup, a decision that felt like finding a reliable friend in the vastness of the internet.

Over time, I noticed that other students were reading my notes. This simple act made me realize that many CS students at UM struggle due to a lack of study materials—answers to past exams, tutorials, and timely access to lecture notes. Online resources like YouTube videos and GeeksforGeeks can be overwhelming and not always helpful. Some even feel like they waste your precious time.

In that moment of clarity, I decided to create a repository to store all CS-related materials. As a Software Engineering student, my focus is on writing notes and answers for SE-related courses. This project is not just about sharing knowledge; it’s about building a community, a support system for those who, like me, have felt lost at times.

Currently, this repository lacks a lot of information. However, I am committed to expanding it, making it as helpful and useful as possible. This isn’t just a study resource; it’s a reflection of my journey through university life.

As I approach graduation from UM, I hope to carry with me knowledge that I can apply in my career and that stays with me throughout my life. I want to look back and see how far I’ve come, how much I’ve learned, and know that I’ve made a difference for others.

This repository contains backups of my Obsidian notes and all local `.md` notes for studying Computer Science.

These are my personal notes, written in a style that might not be formal, with potential factual inaccuracies and language errors. If you find a note unsuitable, feel free to skip it and find one that suits you better.

If you would like to contribute to improving the repository, please submit a Pull Request.

The repository is not fully organized yet, but I plan to fix it eventually. This is more than a project; it’s a labor of love, a testament to my growth, and a gift to all who tread this path after me.